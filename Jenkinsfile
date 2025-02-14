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
    stage('Push Registry') {
      steps {
        sh './gradlew bootJar'
        sh 'docker build . -t datpm/account-service:latest'
        withCredentials([string(credentialsId: 'dockerPwd', variable: 'dockerPwd')]) {
            sh 'docker login -u datpm -p ${dockerPwd}'
            sh 'docker push datpm/account-service:latest'
        }
      }
    }
    stage('Push Registry') {
          steps {
            echo 'Hello World!'
          }
        }
  }
}