eval $(minikube docker-env)
kubectl delete -f kubernetes/team.yaml
docker rmi --force team:latest

mvn clean install -DskipTests
sleep 2

echo "Start creating image..."
docker build -t team .

echo "Start deployment..."
kubectl apply -f kubernetes/team.yaml
minikube service team-service


#export APPLICATION_NAME=team
#kubectl create deployment ${APPLICATION_NAME} --image=${APPLICATION_NAME}:latest
#kubectl expose deployment ${APPLICATION_NAME} --type=LoadBalancer --port=8080
#minikube service ${APPLICATION_NAME}


