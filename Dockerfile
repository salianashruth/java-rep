# pull a base image which give all required tools and liabraries
FROM openjdk:17-jdk-alpine

# Create a folder where the app code will be stored
WORKDIR /app

# Copy the source code from your HOST machine to your container
COPY ./Helloworld.java /app/Helloworld.java

# Compile the application code
RUN javac Helloworld.java

# Run the application its a special command to run the container
CMD ["java","Helloworld"]
