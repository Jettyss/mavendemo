package geex.gong.mavenconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:consumer.xml"})
public class MavenConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenConsumerApplication.class, args);
    }

}
