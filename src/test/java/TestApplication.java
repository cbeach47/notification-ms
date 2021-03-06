import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by rgood on 20/10/2015.
 */
@EnableAutoConfiguration
@EntityScan("uk.ac.ed.notify.entity")
@EnableJpaRepositories(basePackages = {"uk.ac.ed.notify.repository", "uk.ac.ed.notify.repository.test"})
@ComponentScan({"uk.ac.ed.notify.controller","uk.ac.ed.notify.service"})
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
