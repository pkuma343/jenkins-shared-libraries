def call() {
[usernamePassword(credentialsId: 'docker', usernameVariable: 'dockerUserName', passwordVariable: 'dockerPassword'),
 string(credentialsId: 'ocSecret', variable: 'ocToken')]
}