def call(String imageName) {
    script {
        
        sh "docker build -t ${imageName} ."
    }
}
