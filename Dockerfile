FROM bitnami/jenkins:2.452.3

USER root
# Copy the plugins.txt file
COPY plugins.txt /opt/bitnami/jenkins/plugins.txt
# Copy the Configuration as Code (CasC) YAML file into the image
COPY jenkins-casc.yaml /opt/bitnami/jenkins/casc_configs/jenkins.yaml
# Add SSL
COPY jenkins.jks /bitnami/jenkins/home/jenkins.jks
# Specify cache directory
ENV CACHE_DIR=/.cache/jenkins-plugin-management-cli
# Tell the Jenkins Configuration as Code plugin where to find the YAML file
ENV CASC_JENKINS_CONFIG /opt/bitnami/jenkins/casc_configs/jenkins.yaml
# Disable the setup wizard as we will set up Jenkins as code
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

# Install plugins
RUN java -jar /opt/bitnami/jenkins/jenkins-plugin-manager-2.13.0.jar  --war /opt/bitnami/jenkins/jenkins.war --plugin-download-directory /bitnami/jenkins/home/plugins/ --plugin-file /opt/bitnami/jenkins/plugins.txt --verbose

# Expose volumes
VOLUME ["/bitnami/jenkins", "/mnt/jenkins_data"]

# Change user from root to jenkins
USER jenkins
