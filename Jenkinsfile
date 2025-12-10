pipeline {
    agent any

    tools {
        // This forces Jenkins to use the Maven you installed (named 'M3')
        maven 'M3'
    }

    stages {
        stage('Checkout') {
            steps {
                // Downloads your code from GitHub
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // uses 'bat' because you are on Windows
                bat 'mvn clean install'
            }
        }

        stage('Test Report') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}