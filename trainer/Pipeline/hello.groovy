pipeline {
    agent any

    stages {
        stage('Stage 1') {
            steps {
                echo 'Hello from Stage 1'
            }
        }

        stage('Stage 2') {
            steps {
                echo 'Hello from Stage 2'
            }
        }

        stage('Stage 3') {
            steps {
                echo 'Hello from Stage 3'
            }
        }
    }
}
