package pl.tomskr.playground.Playground;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayGroundConfig {

    @Bean
    public FirstBean firstBean(){
        return new FirstBean();
    }
}
