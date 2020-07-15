package org.apache.dolphinscheduler.server.worker.config;

import org.apache.dolphinscheduler.server.master.MasterServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author linyong
 * @date 2020/7/13 16:09
 * @description
 **/
@Configuration
@ComponentScan(value = "org.apache.dolphinscheduler", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {MasterServer.class})
})
public class AppConfig {


}
