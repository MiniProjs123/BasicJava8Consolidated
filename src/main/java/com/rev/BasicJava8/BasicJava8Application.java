package com.rev.BasicJava8;
import com.rev.BasicJava8.func1.FunctionalInstructor;
import com.rev.BasicJava8.j8misc.*;
import com.rev.BasicJava8.ref.Qis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicJava8Application {

	public BasicJava8Application() {
		init();
	}
	private void init() {
//		new Java8misc();
//		new FunctionalInstructor();
		new Qis();
	}


	public static void main(String[] args) {
		SpringApplication.run(BasicJava8Application.class, args);
	}
	

}
