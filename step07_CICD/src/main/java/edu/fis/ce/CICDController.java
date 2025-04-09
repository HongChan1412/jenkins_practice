package edu.fis.ce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.java.Log;

@RestController
@Slf4j
public class CICDController {
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("reqRES************");
		log.info("*** 요청 & 응답 ***");
		for (int i = 1; i <= 10; i ++) {
			System.out.println("data 값" + i	);
		}
		return "success";
	}
}