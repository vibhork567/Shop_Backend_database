pipeline {
	agent any 
	environment {
	    MYSQL_HOST="localhost"
	    MYSQL_PORT=3306
	    MYSQL_USER="root"
	}	
    stages {
        
        
        
        
        
        
        stage('Backend Git Pull') {
            steps {
				git url: 'https://github.com/vibhorkedawat/Shop_Backend_database.git',
				branch: 'master',
                credentialsId: 'github'
            }
        }
        
        stage('Backend Maven Build and Test') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Backend build docker image') {
            steps {
                sh 'docker build -t vib123/spe_major:ver1 .'
            }
        }
        stage('Publish Backend Docker Image') {
            steps {
                withDockerRegistry([ credentialsId: "dockerid", url: "" ]) {
                    sh 'docker push vib123/spe_major:ver1'
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

