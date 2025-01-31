/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */

/**
 * Standalone server classes for consuming log events over a network. Each of the various servers should be used with
 * another Log4j configuration to handle incoming {@link org.apache.logging.log4j.core.LogEvent}s. It is recommended
 * to consider using the <a href="../../../../../../../../../manual/appenders.html#FlumeAppender">Flume Appender</a>
 * for highly reliable networked logging.
 */
package org.apache.logging.log4j.server;

/**Vertigo analytics server usage*/
/**From https://github.com/apache/logging-log4j-server Nov 29, 2022 */

/** Changes :
 * Add support of json syntaxe from log4j JsonTemplateLayout format
 * Add support of compressed Stream (detect via first magic char GZIP and LZF)
 */
