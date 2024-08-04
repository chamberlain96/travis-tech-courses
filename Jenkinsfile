pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-repo/travis-tech-courses.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Run Maven build
                    sh 'mvn clean package'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                script {
                    // Run SonarQube analysis
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Deploy to Nexus') {
            steps {
                script {
                    // Deploy to Nexus
                    sh 'mvn deploy'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image
                    sh 'docker build -t travis-tech-courses-tomcat .'
                }
            }
        }

        //stage('Push Docker Image') {
            steps {
                script {
                    // Login to Docker registry
                    withCredentials([usernamePassword(credentialsId: 'docker-credentials-id', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                        sh 'echo $DOCKER_PASSWORD | docker login your-docker-registry-url -u $DOCKER_USERNAME --password-stdin'
                    }
                    // Push Docker image
                    sh 'docker tag travis-tech-courses-tomcat your-docker-registry-url/travis-tech-courses-tomcat:latest'
                    sh 'docker push your-docker-registry-url/travis-tech-courses-tomcat:latest'
                }
            }
        } //

        stage('Deploy Docker Container') {
            steps {
                script {
                    // Run Docker container
                    sh 'docker run -d -p 8080:8080 travis-tech-courses-tomcat'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and deploy successful!'
        }
        failure {
            echo 'Build or deploy failed.'
        }
    }
}

