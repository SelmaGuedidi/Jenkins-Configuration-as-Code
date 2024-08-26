def call(String imageName, String dockerHubRepo) {
    script {
        sh '''
        echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin
         docker tag ${DOCKER_IMAGE}:latest ${DOCKERHUB_REPO}:${env.BUILD_NUMBER}'
        docker push ${DOCKERHUB_REPO}:${env.BUILD_NUMBER}'
        '''
    }
}
