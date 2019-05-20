pipeline {
    agent any

    stages {
        stage('STAGE 00'){
            steps{
                echo "Pipeline Usando Jenkinsfile   ------------------   build package"
                sh 'mvn package'
            }
        }

        stage('STAGE 01'){
            steps{
                echo "Pipeline Usando Jenkinsfile"
            }
        }
    }
}
