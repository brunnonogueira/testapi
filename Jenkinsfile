pipeline {
    agent any

    stages {
        stage('STAGE 00 - build package'){
            steps{
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
