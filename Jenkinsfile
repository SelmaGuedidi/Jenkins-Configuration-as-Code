properties([
    pipelineTriggers([
        githubPush()
    ])
])

pipeline {
    agent {
        kubernetes {
            cloud "minikube"
            label "curl"
            defaultContainer "curl"
        }
    }
    stages {
        stage('Create job dsl') {
            steps {
                // All DSL files should follow this name
                jobDsl targets: ['folders.groovy', '*/*.groovy'].join('\n'),
                // It will change modified jobs to match DSL script
                ignoreExisting: false,
                // If a job is deleted from the DSL script it will be deleted from Jenkins
                removedJobAction: 'DELETE',
                // Runs the DSL scripts in a sandbox with limited abilities.
                // If unchecked, and you are not a Jenkins administrator, you will need to wait for an administrator to approve the scripts.
                sandbox: true,
                // Set the user to run the DSL job as
                additionalClasspath: 'groovy-sandbox.jar',
                scriptText: '''
                import jenkins.model.Jenkins
                import hudson.security.SecurityRealm
                import hudson.security.Permission
                import jenkins.model.Jenkins

                def instance = Jenkins.getInstance()
                instance.setSecurityRealm(Jenkins.getInstance().getSecurityRealm())
                instance.setAuthorizationStrategy(Jenkins.getInstance().getAuthorizationStrategy())

                String userName = 'admin'  
                def user = instance.getSecurityRealm().loadUserByUsername(userName)
                def auth = user.impersonate()
                instance.setAuthorizationStrategy(Jenkins.getInstance().getAuthorizationStrategy())

                auth
                '''

            }
        }
    }
}