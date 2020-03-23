def call() {
ArrayList vars = [usernamePassword(credentialsId: 'docker', usernameVariable: 'dockerUserName', passwordVariable: 'dockerPassword')]
    return vars
}