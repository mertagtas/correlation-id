pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo Build'
            }
        }
        stage('Test'){
            steps {
                sh '''
                echo Test
                which java
                java -version
                docker version
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
