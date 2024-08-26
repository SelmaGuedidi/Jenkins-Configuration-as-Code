def call(String imageName, String dockerHubRepo) {
    script {
        sh '''
        echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin
         docker tag ${DOCKER_IMAGE} ${DOCKERHUB_REPO}:latest'
        docker push ${DOCKERHUB_REPO}'
        '''
    }
}
