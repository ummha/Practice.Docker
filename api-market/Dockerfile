#FROM ubuntu:latest
FROM azul/zulu-openjdk-alpine:17-latest

ENV APPDIR=/opt/app/api-market/classes
WORKDIR ${APPDIR}
ENV JAVA_DEBUG_OPT="-Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"

#CMD java $JAVA_DEBUG_OPT -Djava.security.egd=file:/dev/./urandom -jar ${APPDIR}/app.jar
CMD java ${JAVA_DEBUG_OPT} -Djava.security.egd=file:/dev/./urandom  -cp .:${APPDIR}/* com.practice.market.MarketApplication
EXPOSE 8080 5005