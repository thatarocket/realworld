package com.backend.realworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RealworldApplicationTests {

	@Test
	void contextLoads() {
		int a = 1;
        int b = 1;
        assertEquals(a, b);
	}

}
