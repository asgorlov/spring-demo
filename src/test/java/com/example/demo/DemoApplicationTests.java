package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.NumberFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Autowired
	@Qualifier("defaultCurrencyFormat")
	private NumberFormat rusFormat;

	@Test
	public void defaultCurrency() {
		double amount = 12345568.09;
		System.out.println(rusFormat.format(amount));
	}

	@Test
	public void germanCurrency() {
		double amount = 12345568.09;
		NumberFormat deFormat = context.getBean("germanNumberFormat", NumberFormat.class);
		System.out.println(deFormat.format(amount));
	}

	@Test
	public void contextLoads(){
		int count = context.getBeanDefinitionCount();
		System.out.println("There are " + count + " beans in application context");
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
