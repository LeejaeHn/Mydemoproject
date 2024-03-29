package org.iclass.vo;

import java.security.NoSuchAlgorithmException;

import org.iclass.service.MemberService;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class HashingTest {

		@Test
		void test() {
			MemberService service = new MemberService();
			try {
				String hashvalue = service.encrypt("1111");
				log.info("해시 값 : {}",hashvalue);
				hashvalue = service.encrypt("thGH123!@4");
				log.info("해시 값 : {}",hashvalue);
			}catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
}
