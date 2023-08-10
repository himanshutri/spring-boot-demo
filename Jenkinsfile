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
                sh "mvn clean package"
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
