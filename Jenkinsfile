node{
  stage('git'){
    git branch: 'main', changelog: false, credentialsId: 'MyGitHub', poll: false, url: 'https://github.com/yashpupneja/FirstJenkinsProject'
  }
  stage('SCM Checkout'){
    git 'https://github.com/yashpupneja/FirstJenkinsProject'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
