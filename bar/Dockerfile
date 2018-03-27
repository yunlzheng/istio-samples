FROM java:8

ADD entrypoint.sh entrypoint.sh
ADD build/libs/bar-1.0-SNAPSHOT.jar bar.jar

RUN bash -c 'touch /bar.jar'
RUN chmod +x entrypoint.sh
ENTRYPOINT ["./entrypoint.sh"]