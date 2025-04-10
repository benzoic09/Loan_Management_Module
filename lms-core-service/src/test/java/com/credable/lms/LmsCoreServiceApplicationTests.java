package com.credable.lms;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // Use the test profile
class LmsCoreServiceApplicationTests {

	@Test
	void contextLoads() {
		// Test will pass if the application context loads
	}

}
