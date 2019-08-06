pipeline {
  agent {
    docker {
      image 'maven:3.6.1-jdk-8'
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