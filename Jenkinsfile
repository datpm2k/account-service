pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/datpm2k/account-service']])
        sh './gradlew build'
      }
    }
    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }
  }
}