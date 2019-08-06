pipeline {
  agent {
    docker {
      image 'maven:3.6.1-jdk-8'
      args '-p 9090:8080'
    }

  }
  stages {
    stage('Start') {
      steps {
        echo 'Start Message'
      }
    }
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
  }
}