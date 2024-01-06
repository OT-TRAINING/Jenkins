include ../Makefile
REPO=https://github.com/opstree/spring3hibernate.git
BRANCH=java7
# REPO=https://github.com/OT-MICROSERVICES/salary-api.git
clone:
	echo "Fetching code base of repo"
	rm -rf code
	git clone ${REPO} code
	cd code ;\
	git checkout ${BRANCH}

cred-scan:
	echo "Scanning for creds"
	cd code ;\
	gitleaks detect --report-path target/gitleaks.json ;\
	cat target/gitleaks.json

compile:
	echo "Compiling code"
	cd code ;\
	mvn compile ;\

test:
	echo "Running tests"
	cd code ;\
	mvn test
	echo "You can view your tests at target/surefire-reports "
cred-scanning:
	cd code ;\
	mvn dependency:resolve

dependency-check:
	cd code ;\
	mvn dependency:resolve

checkstyle:
	cd code ;\
	mvn checkstyle:checkstyle
	echo "You can view your results at target/site"

findbug:
	cd code ;\
	mvn findbugs:findbugs

code-coverage:
	cd code ;\
	mvn cobertura:cobertura