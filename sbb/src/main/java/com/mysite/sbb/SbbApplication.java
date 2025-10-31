package com.mysite.sbb;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SbbApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner init(QuestionRepository questionRepository) {
		return args -> {
			Question q = new Question();
			q.setSubject("첫 질문입니다");
			q.setContent("내용을 작성합니다.");
			q.setCreateDate(LocalDateTime.now());

			questionRepository.save(q);
		};
	}
	*/

}
