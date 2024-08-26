pipelineJob('backend/back') {
    description('Builds the front project from GitHub')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/selmaguedidi/fastapi-app')
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