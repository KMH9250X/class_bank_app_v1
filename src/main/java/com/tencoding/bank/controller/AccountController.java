package com.tencoding.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {
	// 계좌 목록 페이지
	// 주소 설계) http://localhost:80/account/list
	@GetMapping({ "/list", "/" }) // 다중
	public String list() {
		return "account/list";
//		throw new CustomPageException("페이지 없음", HttpStatus.NOT_FOUND);
	}

	// 계좌 생성 페이지
	@GetMapping("/save")
	public String save() {
		return "account/save";
	}

	// 출금 페이지
	@GetMapping("/withdraw")
	public String withdraw() {
		return "account/withdraw";
	}

	// 입금 페이지
	@GetMapping("/deposit")
	public String deposit() {
		return "account/deposit";
	}

	// 이체 페이지
	@GetMapping("/transfer")
	public String transfer() {
		return "account/transfer";
	}

	// 상세 보기 페이지
	@GetMapping("/detail")
	private String detail() {
		return "account/detail";
	}

}
