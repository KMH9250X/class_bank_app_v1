package com.tencoding.bank.repository.model;

import java.sql.Timestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
//두가지를 동시에 : @Data
@Data
public class User {
	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private Timestamp createdAt;

}
