pipeline {
    agent any
    tools {
        maven 'maven3'
        jdk 'jdk15'
    }
    stages {
        stage ('Build') {
            steps {
                bat 'mvn test' 
            }
        }
		stage ('Send Discord') {
			steps {
				discordSend description: "Jenkins Pipeline Build", footer: "Footer Text", link: env.BUILD_URL, result: currentBuild.currentResult, title: "Toto", webhookURL: "https://discord.com/api/webhooks/912268335700402207/nOiEFRcWxiltTmIifXNHP5bCrUrqJgtRVZADpnhlwOdH-j8f8UOKctsrtPNYRlhcJ0GI"
			}
		}
    }
}
