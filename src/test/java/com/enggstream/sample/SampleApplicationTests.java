package com.enggstream.sample;

import com.enggstream.sample.controller.EvaluationController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SampleApplicationTests {

	@Autowired
	private EvaluationController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
