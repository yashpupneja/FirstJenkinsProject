node{
  stage('SCM Checkout'){
    git 'https://github.com/yashpupneja/FirstJenkinsProject'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
