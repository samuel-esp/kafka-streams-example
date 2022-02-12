# Kafka Streams Example Application

This project is a microservices application which implements a communication based on kafka streams. There are 3 microservices inside the project: Input Microservice, Processor Microservice and Output Microservice. The Input Microservice sends a stream through the ```"students-topic"```, the Processor Microservice filter the stream received as an input from the "students-topic" and send the result to the Output Microservices using the ```"older-students-topic"``` 

## Spring Boot Application Properties :leaves:

In order to use this project you first need to set the correct application.properties 

#### 1) Using Local Kafka 

```properties
spring.cloud.stream.kafka.binder.brokers = localhost:9092
```
#### 1) Using Docker Containers

```properties
spring.cloud.stream.kafka.binder.brokers = kafka:9092
```

## Usage

#### 1) Using Local Kafka: 

Start Zookeeper and Kafka (you can use homebrew if you are on a MacOS or Linux system, which is very useful to manage Zookeeper and Kafka).

First make sure to have both Zookeeper and Kafka already installed

```bash 
brew install zookeeper
```

```bash
brew install kafka
```

Then start Zookeeper and Kafka

```bash
brew services start zookeeper
```

```bash
brew services start kafka
```

To stop Zookeeper and Kafka

```bash
brew services stop kafka
```

```bash
brew services stop zookeeper
```

#### 1) Using Docker Containers:

You need to build the .jar file for every microservice using the following command

```bash
mvn spring-boot:build-image service_name
```

Then you can use the four scripts available to build the containers and to start and stop the services: 

```build-images.sh```, ```start-services.sh```, ```stop-services.sh```, ```remove-images.sh```
