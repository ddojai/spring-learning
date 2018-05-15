package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog() {
		System.out.println("[사전 처리] 비즈니스 로직 수행 전 동작");
	}
}
