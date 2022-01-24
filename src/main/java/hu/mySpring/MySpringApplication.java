package hu.mySpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringApplication {

	public static void main(String[] args) {
		System.out.println("A program elindul"); /* A Spring keretrendszer előtt fut le */
		SpringApplication.run(MySpringApplication.class, args);
		System.out.println("A program lezárul");
	}

}
