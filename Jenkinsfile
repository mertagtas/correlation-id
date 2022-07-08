pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build & Test'){
            steps {
                sh '''
                    echo Test
                    which java
                    java -version
                    docker version
                    ./mvnw clean package
                '''
            }
        }
        stage('Build & Publish Docker Images'){
            steps {
                sh '''
                    docker build -t order-service:latest ./order-service
                    docker build -t payment-service:latest ./payment-service
                    docker image ls
                '''
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo Deploy'
            }
        }
    }
}
