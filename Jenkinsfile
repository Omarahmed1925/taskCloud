pipeline {
    agent any
    
    tools {
        // IMPORTANT: This name 'M3' must match what you set in Jenkins > Manage Jenkins > Tools
        maven 'M3' 
    }

    stages {
        stage('Checkout') {
            steps {
                // This checks out code from your repo automatically
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // Windows users use 'bat'. If this fails, try 'sh'
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

