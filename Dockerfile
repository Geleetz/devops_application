FROM openjdk:11
COPY ./out/production/DevOps_Application/com/company/Main.class /tmp
WORKDIR /tmp
ENTRYPOINT ["java","devops_application"]