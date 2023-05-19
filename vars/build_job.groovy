def call(map params){
    def job_list = ""
    def job_path = ""
    def job_wait = 'True'
    def job_propagate = 'False'
    def job_parameters = ""
    job_details.each { job ->
        def job1 = job.job_path
        def wait = job.job_wait
        def propagate = job.job_propagate
        def parameters = job.job_parameters
        stage ("Build job ${job1}") {
            build job : "${job1}",  parameters : parameters
        }
    }
}