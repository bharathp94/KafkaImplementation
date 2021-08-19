# KafkaImplementation

Getting Started : 

This is an example to Produce and consume data in Apache Kafka using Spring Boot.

Prerequisites : 

Follwing Softwares are required to run this application

1. Java 8
2. Apache Kafka
    After installation, 'users' topic topic has to be created before running application.

Usage : 

to publish data to the Kafka,Use follwing request example:
url : http://localhost:8080/kafka/publish
method : POST
Body : { "name": "Bharath", "age": 25  }
