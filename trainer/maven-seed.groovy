// DSL Seed Job

def repo = 'https://github.com/opstree/spring3hibernate.git'
def branch = 'java7'

// Job to clone the repository
job('CloneRepo') {
    steps {
        shell('echo "Fetching code base of repo"')
        shell('rm -rf ~/code')
        shell("git clone ${repo} ~/code")
        shell("cd ~/code ; git checkout ${branch}")
    }
}

// Job to scan for credentials
job('CredScan') {
    steps {
        shell('echo "Scanning for creds"')
        shell('cd ~/code ; gitleaks detect --report-path target/gitleaks.json')
        shell('cat ~/code/target/gitleaks.json')
    }
}

// Job to compile code
job('CompileCode') {
    steps {
        shell('echo "Compiling code"')
        shell('cd ~/code ; mvn compile')
    }
}

// Job to run tests
job('RunTests') {
    steps {
        shell('echo "Running tests"')
        shell('cd ~/code ; mvn test')
        shell('echo "You can view your tests at ~/code/target/surefire-reports "')
    }
}

// Job to scan dependencies
job('DependencyScan') {
    steps {
        shell('echo "Scanning dependencies"')
        shell('cd ~/code ; mvn dependency:resolve')
    }
}

// Job to check code style
job('CheckStyle') {
    steps {
        shell('echo "Checking code style"')
        shell('cd ~/code ; mvn checkstyle:checkstyle')
        shell('echo "You can view your results at ~/code/target/site"')
    }
}

// Job to find bugs
job('FindBugs') {
    steps {
        shell('echo "Finding bugs"')
        shell('cd ~/code ; mvn findbugs:findbugs')
    }
}

// Job for code coverage
job('CodeCoverage') {
    steps {
        shell('echo "Calculating code coverage"')
        shell('cd ~/code ; mvn cobertura:cobertura')
    }
}

