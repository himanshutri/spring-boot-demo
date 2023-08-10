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
 
                sh "mvn clean install "
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
