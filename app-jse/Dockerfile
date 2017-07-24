FROM payara/micro
MAINTAINER Rodrigo Bento <rodrigobentor2014@gmail.com>
ADD target/dac-jse-jar-with-dependencies.jar $PAYARA_PATH/
ENTRYPOINT ["java", "-jar", "dac-jse-jar-with-dependencies.jar"]