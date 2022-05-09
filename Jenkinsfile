pipeline {
		agent any 
    stages {
        stage('Git Pull') {
            steps {
				git url: 'https://github.com/vibhorkedawat/Calculator_Mini_Project.git',
				branch: 'main',
                credentialsId: 'vibtoken'
            }
        }
        stage('Maven Build and Test') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker build image') {
            steps {
                sh 'docker build -t vib123/calculator_mini_project:ver1 .'
            }
        }
        stage('Publish Docker Images') {
            steps {
                withDockerRegistry([ credentialsId: "dockerid", url: "" ]) {
                    sh 'docker push vib123/calculator_mini_project:ver1'
                }
            }
        }
        
        stage('Ansible Deploy') {
             steps {
                  ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'p2.yml' ,sudoUser: null
             }
        }
    }
    
    post {
        always {
            sh 'docker logout'
        }
    }
}
