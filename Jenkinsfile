pipeline {
    agent {
        kubernetes{
            label 'mypod'
            defaultContainer 'jnlp'
        }
    }

    stages {
        stage('Main') {
            steps {
                sh 'ls /'
            }
        }
    }
}