('master' || 'built-in' || 'main') {

	try {

		stage('SCM') {

			git branch: 'main',
			credentialsId: 'programadormovel',
			url: 'https://github.com/programadormovel/miniprojetospring2024.git'
		}

		stage('Mvn Package'){

			sh 'mvn clean package'
		}

		stage('SonarQube analysis') {

			withSonarQubeEnv('sonar') {

				sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=miniprojetospring2024 -Dsonar.host.url=http://127.0.0.1:9000 -Dsonar.login=sqp_4a899e5c5fb0e85f9475555eccfdc54ca5b7f665'

			}

		}




	}catch (e) {

		throw e
	}


}