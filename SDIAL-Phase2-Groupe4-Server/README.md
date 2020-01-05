## Steps to Setup
**1. Create Mysql database**
**2. Change mysql username and password as per your installation**

+ open `src/main/resources/application.yml`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**3. Build and run the app using maven**


    mvnw package
    java -jar target/sdial-phase2-groupe4-0.0.1-SNAPSHOT.jar


Alternatively, you can run the app without packaging it using -


    mvnw spring-boot:run


The app will start running at <http://localhost:9000>.

**4. To stop the server**

    CTRL+C in cmd


Or go send a post request on this url

    http://localhost:9000/actuator/shutdown



## Explore Rest APIs
You can see Documentation about this API on 

    http://localhost:9000/api-docs-json

Or on

    http://localhost:9000/api-docs
    
##Steps to get a public url for API and invoke it:
1. Create an account in https://dashboard.ngrok.com/get-started
2. Follow the steps in setup and Installation 
3. Execute the ngrok application in the downloaded folder
4. Enter this command in ngrok terminal to tell ngrok what port your web server is listening on. :
       
        ngrok http 9000  

5. ngrok will display a UI in your terminal with the public URL of your tunnel:

        Forwarding http://100a3ae9.ngrok.io -> http://localhost:9000
6. try making a request to your public URL, for example 

        http://100a3ae9.ngrok.io/api/persons


