package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@SpringBootApplication
public class MyWebApplication {

	@Controller
	public class HelloController{
		
		@RequestMapping("/hello")
		public String hello() {
			return "hello";
		}
	}
	public static void main(String[] args) {
		// 웹에서는 톰캣이 실행하면서 쓰레드가 뜨기 때문에 try로 종료시키면 안됨.
		SpringApplication.run(MyWebApplication.class, args);

	}

}
