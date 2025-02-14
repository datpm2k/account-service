pipeline {
  agent any
  tools {
    maven "maven_3_9_9"
  }
  stages {
    stage('Build') {
      steps {
        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-user', url: 'https://github.com/datpm2k/account-service']])
        sh "mvn clean package"
      }
    }
    stage('Test') {
      steps {
        echo 'Tested successfully'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploy successfully'
      }
    }
  }
}