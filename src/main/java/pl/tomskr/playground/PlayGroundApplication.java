package pl.tomskr.playground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import pl.tomskr.playground.Playground.FirstBean;
import pl.tomskr.playground.Playground.PlayGroundConfig;

@SpringBootApplication
public class PlayGroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlayGroundApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(PlayGroundConfig.class);

        FirstBean firstBean = context.getBean(FirstBean.class);
        firstBean.writeHello();
    }




}
