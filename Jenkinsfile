pipeline {
    agent any
    tools {
        maven 'apache-maven-3.8.6'
    }
    stages {
        stage('Build') {
            steps {
                sh "mvn clean package -DskipTests"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
    }
}