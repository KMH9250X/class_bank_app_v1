package com.tencoding.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tencoding.bank.dto.SignInFormDto;
import com.tencoding.bank.dto.SignUpFormDto;
import com.tencoding.bank.handler.exception.CustomRestfulException;
import com.tencoding.bank.repository.interfaces.UserRepository;
import com.tencoding.bank.repository.model.User;

@Service
public class UserService {

	// DAO - 데이터 베이스 연습
	@Autowired
	private UserRepository userRepository;

//	// DI - 디펜던시 인젝션, 가지고 옴
//	public UserService(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}

	// 트랜잭션 사용하는 이유는 정상처리 commit()
	@Transactional
	public void signUp(SignUpFormDto signUpFormDto) {
		int result = userRepository.insert(signUpFormDto);
		System.out.println("result : " + result);
		if (result != 1) {
			throw new CustomRestfulException("회원가입실패", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	public User signIn(SignInFormDto signInFormDto) {

		User userEntity = userRepository.findByUsernameAndPassword(signInFormDto);
		if (userEntity == null) {
			throw new CustomRestfulException("회원 정보 인증 실패", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return userEntity;
	}
}
