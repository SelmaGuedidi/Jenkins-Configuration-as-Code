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
    properties {
        authorization {
            permission('hudson.model.Item.Read', 'admin')
            permission('hudson.model.Item.Build', 'admin')
            permission('hudson.model.Item.Configure', 'admin')
            permission('hudson.model.Item.Delete', 'admin')

            permission('hudson.model.Item.Read', 'user1')
            permission('hudson.model.Item.Build', 'user1')
            permission('hudson.model.Item.Configure', 'user1')

            permission('hudson.model.Item.Read', 'user2')
            permission('hudson.model.Item.Build', 'user2')
        }
    }
    
}
