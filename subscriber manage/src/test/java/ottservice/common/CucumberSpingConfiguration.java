package ottservice.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import ottservice.SubscriberManageApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SubscriberManageApplication.class })
public class CucumberSpingConfiguration {}
