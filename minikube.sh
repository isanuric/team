eval $(minikube docker-env)
mvn spring-boot:build-image
export APPLICATION_NAME=team

kubectl create deployment ${APPLICATION_NAME} --image=${APPLICATION_NAME}:0.0.1-SNAPSHOT
kubectl expose deployment ${APPLICATION_NAME} --type=LoadBalancer --port=8080
minikube service ${APPLICATION_NAME}

