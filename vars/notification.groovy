def notification(){
  failure {
        mail to: 'rishabap23@gmail.com',
             subject: "Pipeline Execution: ${currentBuild.fullDisplayName}",
             body: "The build ${currentBuild.fullDisplayName} has completed with status: ${currentBuild.result}."
    }
}
