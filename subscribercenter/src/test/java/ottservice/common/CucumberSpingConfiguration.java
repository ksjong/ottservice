package ottservice.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import ottservice.SubscribercenterApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SubscribercenterApplication.class })
public class CucumberSpingConfiguration {}
