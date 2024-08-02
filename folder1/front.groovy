pipelineJob('folder1/front') {
    description('Builds the front project from GitHub')
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/nicktodd/basicreact')
                    }
                    branches('*/master')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
    triggers {
        githubPush()
    }
    
    
}
