package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import ex03.component.MyComponent;

@SpringBootConfiguration
// componentScan에 패키지를 지정해주지 않아도됨
// 해당 패키지의 하부 패키지를 조회하여 스캔함.
@ComponentScan
public class MyApplication {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)) {
		}
	}
}
