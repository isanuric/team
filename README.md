# Team
A sample for testing Hibernate, Postgres, JdbcTemplate and HikariCP, Kubernetes, Minikube.


## Deployment




#### Minikube
Download and start latest [minikube](https://minikube.sigs.k8s.io/docs/start/) version:  
`$ minikube start`   
`$ eval $(minikube docker-env)`  

Create docker image inside minikube:  
`$ mvnw spring-boot:build-image`

Deploy docker image  
`$ kubectl create deployment team --image=team:0.0.1-SNAPSHOT`   


`$ minikube service bar --url`  
