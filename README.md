# Team
A sample for testing Hibernate, Postgres, JdbcTemplate and HikariCP, Kubernetes, Minikube.


## Deployment
#### Create Docker
`$ mvnw spring-boot:build-image`



#### Minikube
Download latest [minikube](https://minikube.sigs.k8s.io/docs/start/) version.  
`$ minikube start`   
`$ eval $(minikube docker-env)`  
`$ kubectl create deployment team --image=team:0.0.1-SNAPSHOT`   
`$ minikube service bar --url`  
