//package com.example.demo;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.junit4.SpringRunner;
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//public class DemoApplicationTests {
//
//	@Test
//	public void contextLoads() {
//	}
//
//	@Autowired
//	private TestRestTemplate restTemplate;
//
//	@Test
//	public void homeResponse() {
//		String body = this.restTemplate.getForObject("/", String.class);
//		assertThat(body).isEqualTo("Spring is here!");
//	}
//}

//./mvnw -Pprod clean verify sonar:sonar -Dsonar.host.url=http://92.112.178.142:9000 -Dsonar.login=admin -Dsonar.password=Adm@290404
