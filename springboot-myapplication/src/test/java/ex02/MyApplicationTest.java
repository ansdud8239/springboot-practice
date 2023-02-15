package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * Springboot Test Integration
 * 
 * Spring Boot Test Integration(@SpringBootTest)에서는
 * 자동 스캔을 위해서는 설정 클래스에 @SpringBootConfiguration을 달고 있어야함다 
 * 
 * */
@SpringBootTest
public class MyApplicationTest {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
