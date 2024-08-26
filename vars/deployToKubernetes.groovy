def call(String deploymentYaml, String serviceYaml) {
    script {
        sh "kubectl apply -f ${deploymentYaml}"
        sh "kubectl apply -f ${serviceYaml}"
    }
}