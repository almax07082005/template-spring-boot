package pr.templatespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class TemplateSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateSpringBootApplication.class, args);
    }
}
