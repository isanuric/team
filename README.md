# Team
A sample for testing Hibernate, Postgres, JdbcTemplate, HikariCP, Kubernetes and Minikube.


## Deployment




#### Minikube

* Download and start latest [minikube](https://minikube.sigs.k8s.io/docs/start/) version:  
`$ minikube start --vm-driver=virtualbox --extra-config=kubelet.authentication-token-webhook=true`   
* Install ingress controller in minikube:  
`$  minikube addons enable ingress`


##### Deployments (First Approach)
* Create docker image inside minikube:  
`$ eval $(minikube docker-env)`  
`$ mvnw spring-boot:build-image`  
`$ export APPLICATION_NAME=team`

* Deploy docker image  
`$ kubectl create deployment ${APPLICATION_NAME} --image=${APPLICATION_NAME}:0.0.1-SNAPSHOT`   

* Expose the Deployment:  
`$ kubectl expose deployment ${APPLICATION_NAME} --type=LoadBalancer --port=8080`

* Access the application from outside:  
`$ minikube service ${APPLICATION_NAME}` 

or  
  
##### Deployments (Second Approach)
* Execute minikube.sh  
`$ chmod +x minikube.sh`  
`$ ./minikube.sh`

