def call() {
    echo "Sending notification..."
    mail to: 'rishabap23@gmail.com',
    subject: "Pipeline status: ${currentBuild.fullDisplayName}",
    body: "The build ${currentBuild.fullDisplayName} is ${currentBuild.result}. Please check the logs for details."
}
