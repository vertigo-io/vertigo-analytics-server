#!/bin/sh
/usr/app/bin/wait-for-it.sh $INFLUXDB_URL -- java -cp /usr/app/bin/vertigo-analytics-server-0.13.1-jar-with-dependencies.jar -Djava.awt.headless=true io.vertigo.analytics.server.AnalyticsServerStarter log4j2 4562 /usr/app/conf/log4j2.xml log4j2json-gz 4563 /usr/app/conf/log4j2.xml