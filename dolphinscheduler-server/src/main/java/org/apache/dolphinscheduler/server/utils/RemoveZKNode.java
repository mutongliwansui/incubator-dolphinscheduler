/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dolphinscheduler.server.utils;

import org.apache.dolphinscheduler.server.worker.config.AppConfig;
import org.apache.dolphinscheduler.service.zk.ZookeeperOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RemoveZKNode {

    private static final Integer ARGS_LENGTH = 1;

    private static final Logger logger = LoggerFactory.getLogger(RemoveZKNode.class);


    public static void main(String[] args) {
        if (args.length != ARGS_LENGTH){
            logger.error("Usage: <node>");
            return;
        }
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ZookeeperOperator zookeeperOperator = context.getBean(ZookeeperOperator.class);
        zookeeperOperator.remove(args[0]);
        zookeeperOperator.close();
    }
}
