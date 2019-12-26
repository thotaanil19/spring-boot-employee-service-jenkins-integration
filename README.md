# Getting Started...

Step 1: First start the Redis Cache server
In my local: run Redis-x64-3.2.100/redis-server.exe

Step2: If you run Redis server in in differnt host/port, make sure update them in application.properties file

Step 3: Run the this redis-cache-demo spring boot application.

Step 4: Test the rest endpoints

1. http://localhost:8080/app/emp/1 - Will get results from DB
2. http://localhost:8080/app/emp/1 - Will get results from Redis Cache

1. [POST] http://localhost:8080/app/emp
{
    "id": 4,
    "name": "Kittu",
    "salary": 180
}
 It saves the newly inserted record into Redis cache-demo
 2. http://localhost:8080/app/emp/4 - Will get the results from Cache
 
 
 # This is the Demo Project for Jenkins Build Tool.
 
 Once we comit any changes to this master branch, Jenkis will automatically build this Maven Project
 
 # How to start Jenkins Server
 Path to Jenkins war> java -jar jenkins.war
 
 Jenkins username/pwd : scott/tiger
 
 More about Jenkins server installation can be found at https://www.tutorialspoint.com/jenkins/jenkins_installation.htm
 
 
 # Access the Jenkins dashboard from browser
 
 http://localhost:8080
 
 
 

