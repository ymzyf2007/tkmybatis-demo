package org.alex.dragon.tkmybatis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {
	
//	@BeforeClass – 表示在类中的任意public static void方法执行之前执行
//	@AfterClass – 表示在类中的任意public static void方法执行之后执行
//	@Before – 表示在任意使用@Test注解标注的public void方法执行之前执行
//	@After – 表示在任意使用@Test注解标注的public void方法执行之后执行
//	@Test – 使用该注解标注的public void方法会表示为一个测试方法
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void setUp() {
		System.out.println("Before");
	}
	
	@After
	public void tearDown() {
		System.out.println("After");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	// 执行结果
	
//	BeforeClass
//	Before
//	test1
//	After
//	Before
//	test2
//	After
//	AfterClass
	
	// 执行所有单元测试，@Before和@After每执行一个@Test都会执行，而@BeforeClass和@AfterClass只会执行一次

}