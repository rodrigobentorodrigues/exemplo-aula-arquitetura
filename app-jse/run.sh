sudo docker stop jse
sudo docker rm jse
sudo docker rmi rnc/jse
mvn clean install
sudo docker build -t rnc/jse .
sudo docker run -p 8080:8080 -d --name jse --link app:host-core rnc/jse
