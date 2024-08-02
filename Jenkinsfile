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
                jobDsl targets: ['folders.groovy', 'folder1/*.groovy'].join('\n'),
                // It will change modified jobs to match DSL script
                ignoreExisting: false,
                // If a job is deleted from the DSL script it will be deleted from Jenkins
                removedJobAction: 'DELETE',
                // Runs the DSL scripts in a sandbox with limited abilities.
                
                sandbox: true
                
            }
        }
         stage('Set Permissions') {
            steps {
                script {
                    def groovyScript = readFile('perm/front.groovy')
                    def binding = new Binding()
                    def shell = new GroovyShell(binding)
                    shell.evaluate(groovyScript)
                }
            }
        }
    }
}