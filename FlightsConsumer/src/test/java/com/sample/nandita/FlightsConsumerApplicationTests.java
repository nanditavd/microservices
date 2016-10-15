package com.sample.nandita;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FlightsConsumerApplication.class)
@WebAppConfiguration
public class FlightsConsumerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
