def call(String deploymentYaml, String serviceYaml,  String serviceName, String port , String portForward) {
    script {
        sh "kubectl apply -f ${deploymentYaml}"
        sh "kubectl apply -f ${serviceYaml}"
   //    sh "kubectl port-forward service/${serviceName} ${portForward}:${port}"
    }
} 