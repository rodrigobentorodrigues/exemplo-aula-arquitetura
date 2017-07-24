sudo docker stop app
sudo docker rm app 
sudo docker rmi rnc/app
mvn clean install
sudo docker build -t rnc/app .
sudo docker run -p 8081:8080 -p 3700:3700 -d --name app rnc/app
