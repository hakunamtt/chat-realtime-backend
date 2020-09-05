FROM java:8
COPY ./target/chat-realtime-backend-0.0.1-SNAPSHOT.jar /usr/src/app/chat-realtime-backend.jar
WORKDIR /usr/src/app
EXPOSE 1234
CMD ["java", "-jar", "chat-realtime-backend.jar"]