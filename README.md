# SpringCloudFunctionDemo
1. start the jvm either by doing "java jar" or run it from eclipse/sts
2. curl -H "Content-Type: application/json" localhost:8080/upperCase -d '{"value":"hello"}'
3. curl -H "Content-Type: application/json" localhost:8080/lowerCase -d '{"value":"Hello"}'
4. change the dependency to spring-cloud-function-stream, start a rabbit server, then publish a message.
