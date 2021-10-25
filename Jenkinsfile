pipeline {
    agent any
    tools {
        maven 'maven3'
        jdk 'jdk15'
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn test' 
            }
        }
    }
}
