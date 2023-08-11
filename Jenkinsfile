pipeline 
{
    agent any

    tools{
      maven 'MAVEN_HOME'
    }
    stages 
    {
        stage('Build') 
        {
            steps 
            {
                echo 'Build App'
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/himanshutri/spring-boot-demo.git']])
                bat "mvn clean install "
            }
        }
        
        stage('Build docker image'){
            steps
            {
              script{
                bat 'docker build -t himanshu28138/spring-boot-demo .'
              }
            }
        }
        
      
 stage('push image to docker'){
            steps
            {
              script{
                  withCredentials([string(credentialsId: 'docker-admin', variable: 'dockerpassword')]) {
                        bat 'docker login -u himanshu28138 -p ${dockerpassword}'
                    }
                bat 'docker push himanshu28138/spring-boot-demo'
              }
            }
        }


        stage('Test') 
        {
            steps 
            {
                echo 'Test App'
            }
        }

        stage('Deploy') 
        {
            steps 
            {
                echo 'Deploy App'
            }
        }
    }

    post
    {

    	always
    	{
    		emailext body: 'Summary', subject: 'Pipeline Status', to: 'himanshu28138@gmail.com'
    	}

    }
}
