package com.tencoding.bank.dto;

import lombok.Data;

@Data
public class DepositFormDto {
	private Long amount;
	private String dAccountNumber;

	// TODO - 추후 추가 예정
}
