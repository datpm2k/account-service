pipeline {
  agent any
  stages {
    stage('Checkout') {
        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/datpm2k/account-service']])
    }
    stage('Build') {
      steps {
        sh './gradlew build'
      }
    }
    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('Deploy') {
        steps {
            sh 'Deploy completed successfully'
        }
    }
  }
}