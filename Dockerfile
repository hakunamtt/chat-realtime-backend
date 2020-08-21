FROM java:8
COPY ./target/backend-chat-realtime-0.0.1-SNAPSHOT.jar /usr/src/app/backend-chat-realtime.jar
WORKDIR /usr/src/app
CMD ["java", "-jar", "backend-chat-realtime.jar"]