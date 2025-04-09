package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals; 

@SpringBootTest
class Step07CicdApplicationTests {

	@Test 
	void contextLoads() {
		int result = 2 + 3;
		
		System.out.println("비교 전***********");
		assertEquals(5, result);  
		
		System.out.println("비교 후***********");
	}

}
