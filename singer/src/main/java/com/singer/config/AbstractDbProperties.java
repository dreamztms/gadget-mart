package com.singer.config;

import lombok.Data;

@Data
public abstract class AbstractDbProperties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
