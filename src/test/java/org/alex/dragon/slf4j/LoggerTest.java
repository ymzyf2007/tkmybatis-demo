package org.alex.dragon.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 如果不想每次都写private final Logger logger = LoggerFactory.getLogger(XXX.class);
 * 可以用注解@Slf4j
 * 
 *
 */
@Slf4j
public class LoggerTest {
	private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

	/**
	 * 一、传统方式实现日志
	 */
	@Test
	public void test1() {
		logger.debug("debug message");
		logger.warn("warn message");
		logger.info("info message");
		logger.error("error message");
		logger.trace("trace message");
	}

	/**
	 * 二、注解方式实现日志
	 */
	@Test
	public void test2() {
		log.debug("debug message");
		log.warn("warn message");
		log.info("info message");
		log.error("error message");
		log.trace("trace message");
	}

}