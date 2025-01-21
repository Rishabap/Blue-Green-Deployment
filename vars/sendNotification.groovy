
def sendnotification() {
        if (currentBuild.result == 'FAILURE'){
        mail to: 'rishabap23@gmail.com',
        subject: "Pipeline Failure: ${currentBuild.fullDisplayName}",
        body: "The build ${currentBuild.fullDisplayName} failed. Please check the logs for details."
    
}
