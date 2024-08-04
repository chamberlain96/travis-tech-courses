# Use the official Tomcat image
FROM tomcat:10-jdk11

# Set environment variables for Tomcat
ENV CATALINA_HOME /usr/local/tomcat
ENV CATALINA_BASE /usr/local/tomcat

# Remove default web applications
RUN rm -rf ${CATALINA_HOME}/webapps/examples ${CATALINA_HOME}/webapps/docs

# Copy your WAR file to the Tomcat webapps directory
COPY target/travis-tech-courses.war ${CATALINA_HOME}/webapps/travis-tech-courses.war

# Expose Tomcat's default HTTP port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]

