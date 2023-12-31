package com.tencoding.bank.handler;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tencoding.bank.handler.exception.CustomRestfulException;

/*
 * 예외 발생 시 (Json, Xml)
 * 데이터를 가공해 내려 줄 수 있음
 */
@Order(1)
@RestControllerAdvice // IoC, Aop 대상
public class MyRestfulExepcionHandler {

	@ExceptionHandler(Exception.class)
	public void exception(Exception e) {
		System.out.println("==============예외 발생 확인==============");
		System.out.println(e.getMessage());
		System.out.println("==========================================");
	}

	// 사용자 정의 예외 클래스 활용
	@ExceptionHandler(CustomRestfulException.class)
	public String basicException(CustomRestfulException e) {
		StringBuffer sb = new StringBuffer();
		sb.append("<script>");
		sb.append("alert(' " + e.getMessage() + " ');"); // 문자열 안에 반드시 ; 기입
		sb.append("history.back();");
		sb.append("</script>");

		return sb.toString();
	}
}
