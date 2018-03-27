FROM java:8

ADD entrypoint.sh entrypoint.sh
ADD build/libs/foo-1.0-SNAPSHOT.jar foo.jar

RUN bash -c 'touch /foo.jar'
RUN chmod +x entrypoint.sh
ENTRYPOINT ["./entrypoint.sh"]