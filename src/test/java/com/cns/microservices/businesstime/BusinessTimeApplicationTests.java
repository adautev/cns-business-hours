package com.cns.microservices.businesstime;

import org.dhatim.businesshours.BusinessHours;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessTimeApplicationTests {

	@Test
	public void contextLoads() {
		BusinessHours h = new BusinessHours("wday{Mon-Fri} hour{9am-6pm}, wday{Sat} hour{9am-12pm}");
	}

}
