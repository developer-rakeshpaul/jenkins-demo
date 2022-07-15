pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('spring-boot-api-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/developer-rakeshpaul/jenkins-spring-boot-api.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}

pipelineJob('spring-boot-api-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/developer-rakeshpaul/jenkins-spring-boot-api.git'
                    }
                    branch 'main'
                    scriptPath 'Jenkinsfile-docker'
                }
            }
        }
    }
}

pipelineJob('spring-boot-api-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/developer-rakeshpaul/jenkins-spring-boot-api.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}