package ottservice.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import ottservice.SubscribeApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { SubscribeApplication.class })
public class CucumberSpingConfiguration {}
