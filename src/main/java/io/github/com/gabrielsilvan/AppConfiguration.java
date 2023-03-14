package io.github.com.gabrielsilvan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean(name = "applicationName")
    public String applicationName() {
        return "App Estudos Spring";
    }
}
