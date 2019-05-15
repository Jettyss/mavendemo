package geex.gong.mavenprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo.xml"})
public class MavenProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenProviderApplication.class, args);
    }

}
