def call(String imageName) {
    script {
        sh 'docker info'
        sh "docker build -t ${imageName} ."
    }
}
