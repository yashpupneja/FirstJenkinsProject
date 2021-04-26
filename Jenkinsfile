node{
  stage('SCM Checkout'){
    checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'MyGitHub', url: 'https://github.com/yashpupneja/FirstJenkinsProject']]]
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
