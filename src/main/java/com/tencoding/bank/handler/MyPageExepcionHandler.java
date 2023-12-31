package com.tencoding.bank.handler;

import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.tencoding.bank.handler.exception.CustomPageException;

/*
 * View 렌더링을 위해 ModelAndView 
 * 객체를 반환하도록 설계할 때 사용 
 * 예외 page를 리턴하도록 설계 
 */
@Order(2)
@RestControllerAdvice // IoC 대상
public class MyPageExepcionHandler {

	@ExceptionHandler(Exception.class)
	public void exception(Exception e) {
		System.out.println("==============예외 발생 확인==============");
		System.out.println(e.getMessage());
		System.out.println("==========================================");
	}

	// 사용자 정의 클래스 활용
	@ExceptionHandler(CustomPageException.class)
	public ModelAndView handleRuntimePageException(CustomPageException e) {
		// mav활용법 - 페이지 명시해야함
		ModelAndView mav = new ModelAndView("errorPage");
		mav.addObject("status", HttpStatus.NOT_FOUND.value());
		mav.addObject("message", e.getMessage());

		return mav;
	}
}
