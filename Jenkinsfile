node{
  stage('git'){
    git credentialId: 'MyGitHub',url: 'https://github.com/yashpupneja/FirstJenkinsProject'
  }
  stage('SCM Checkout'){
    git 'https://github.com/yashpupneja/FirstJenkinsProject'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
