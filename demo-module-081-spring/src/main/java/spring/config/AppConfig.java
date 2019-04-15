package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.pojo.JuiceMaker;

@Configuration
public class AppConfig {

    @Bean(name = "juiceMaker")
    public JuiceMaker juiceMaker() {
        return new JuiceMaker();
    }
}
