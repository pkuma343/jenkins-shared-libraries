def call() {
Map vars = [usernamePassword(credentialsId: 'docker', usernameVariable: 'dockerUserName', passwordVariable: 'dockerPassword')]
    return vars
}