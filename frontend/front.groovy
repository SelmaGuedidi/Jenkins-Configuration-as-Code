pipelineJob('frontend/front') {
    description('Builds the front project from GitHub')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/selmaguedidi/react-app')
                    }
                    branches('*/main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
    triggers {
        githubPush()
    }
    
    
}
