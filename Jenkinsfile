pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh './mvnw clean build -x test'
            }
        }
        stage('Test'){
            steps {
                sh '''
                echo Test
                which java
                java -version
                docker version
                ./mvnw clean test
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
