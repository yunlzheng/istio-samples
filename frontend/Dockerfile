FROM java:8

ADD entrypoint.sh entrypoint.sh
ADD build/libs/frontend-1.0-SNAPSHOT.jar frontend.jar

RUN bash -c 'touch /frontend.jar'
RUN chmod +x entrypoint.sh
ENTRYPOINT ["./entrypoint.sh"]