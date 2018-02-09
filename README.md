Built Application
docker build -t springboot-app:latest .

Run Docker container 
docker run -tid -p 8080:8080 --name sbapp springboot-app:latest

Check running
docker ps

Check logs
docker logs sbapp

Stop container
docker container stop sbapp