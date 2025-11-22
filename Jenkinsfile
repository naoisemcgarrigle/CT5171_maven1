pipeline {
    agent any

    stages {
        stage('GetProject') {
            steps {
                git (
                    url: 'https://github.com/naoisemcgarrigle/CT5171_maven1.git',
                    branch: 'main'
                )
            }
        }
        stage('Build') {
            steps {
                sh "mvn compiler:compile"
                sh "mvn dependency:copy-dependencies"
                sh "mvn clean:clean"
            }
        }
        stage('Exec') {
            steps {
                sh "mvn exec:java"
            }
        }
    }
}