package com.gadgetmart.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * @author thilinamullewidane
 */
@Data
@Component
@ConfigurationProperties(prefix = "application.datasource")
public class DbProperties {

    private DefaultDB defaultDB;


}
