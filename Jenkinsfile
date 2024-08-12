properties([
    pipelineTriggers([
        githubPush()
    ])
])

pipeline {
    agent {
        kubernetes {
            cloud "minikube"
            label "shell"
            defaultContainer "shell"
        }
    }
    stages {
        stage('Create job dsl') {
            steps {
                // All DSL files should follow this name
                jobDsl targets: ['folders.groovy', 'folder2/*.groovy'].join('\n'),
                // It will change modified jobs to match DSL script
                ignoreExisting: false,
                // If a job is deleted from the DSL script it will be deleted from Jenkins
                removedJobAction: 'DELETE',
                // Runs the DSL scripts in a sandbox with limited abilities.
                
                sandbox: true
                
            }
        }
        
    }
}