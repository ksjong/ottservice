package ottservice.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import ottservice.SubscribermanageApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SubscribermanageApplication.class })
public class CucumberSpingConfiguration {}
