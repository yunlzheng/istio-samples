#!/usr/bin/env bash
java -Xmx1024m -Djava.security.egd=file:/dev/./urandom -jar foo.jar $@