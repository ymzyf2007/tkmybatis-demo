package org.alex.dragon.tkmybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(JUnit4.class)
//@RunWith(SpringRunner.class) // SpringRunner 继承了SpringJUnit4ClassRunner，没有扩展任何功能；使用前者，名字简短而已
public class AppTest {
	
	@Test
	public void start() {
		System.out.println("==========Test Starting========");
	}
	
}