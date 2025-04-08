curl https://start.spring.io/starter.zip \
  -d type=maven-project \
  -d language=java \
  -d bootVersion=3.2.0 \
  -d baseDir=lms-core-service \
  -d groupId=com.credable.lms \
  -d artifactId=lms-core-service \
  -d name=lms-core-service \
  -d packageName=com.credable.lms \
  -d packaging=jar \
  -d javaVersion=17 \
  -d dependencies=web,data-jpa,postgresql,webflux,validation,ws,actuator \
  -o lms-core-service.zip
unzip lms-core-service.zip -d lms-core-service