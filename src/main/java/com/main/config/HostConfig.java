package com.main.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class HostConfig {
    @Value("${server.port}")
    private String port;
}
