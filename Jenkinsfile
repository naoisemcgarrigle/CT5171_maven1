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
                sh "mvn clean:clean"
                sh "mvn dependency:copy-dependencies"
                sh "mvn compiler:compile"
            }
        }
        stage('Run') {
            steps {
                sh "mvn spring-boot:run -Dspring-boot.run.arguments=\"--SERVER.PORT=8081\""
            }
        }
    }
}