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
                sandbox: true
            }
        }
    }
}