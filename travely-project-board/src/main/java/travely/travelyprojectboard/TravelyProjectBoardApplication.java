package travely.travelyprojectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class TravelyProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelyProjectBoardApplication.class, args);
    }

}
