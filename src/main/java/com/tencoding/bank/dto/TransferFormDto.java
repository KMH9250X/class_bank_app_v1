package com.tencoding.bank.dto;

import lombok.Data;

@Data
public class TransferFormDto {
	private Long amount;
	private String wAccountNumber;
	private String wAccountPassword;

	private String dAccountNumber;

	// TODO - 추후 추가 예정
}
