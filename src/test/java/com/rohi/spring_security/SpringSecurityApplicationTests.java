package com.rohi.spring_security;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SpringSecurityApplicationTests {

	@Test
	void contextLoads() {
		assertTrue("Passed", true);
	}

}
