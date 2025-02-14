pipeline {
  agent any
  tools {
      gradle 'gradle_8_12_1'
  }
  stages {
    stage('Build') {
      steps {
        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-user', url: 'https://github.com/datpm2k/account-service']])
        sh 'gradle clean build'
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