pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-user', url: 'https://github.com/datpm2k/account-service']])
        sh './gradlew build'
      }
    }
    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('Push Registry') {
      steps {
        sh './gradlew bootJar'
        sh 'docker build . -t account-service'
      }
    }
  }
}