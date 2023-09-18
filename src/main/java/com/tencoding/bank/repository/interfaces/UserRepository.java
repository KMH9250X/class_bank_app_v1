package com.tencoding.bank.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tencoding.bank.dto.SignInFormDto;
import com.tencoding.bank.dto.SignUpFormDto;
import com.tencoding.bank.repository.model.User;

// ibatis -> 2.4 버전 이후로 myBatis로 이름 변경됨
@Mapper // 어노테이션 지정해줘야 동작함
public interface UserRepository {
	// 뱅크 앱

	public int insert(SignUpFormDto dto);

	public int updateById(User user);

	public int deleteById(Integer id);

	public User findById(Integer id);

	// 관리자측 - 회원정보 리스트를 보고싶다면
	public List<User> findAll();
	
	public User findByUsernameAndPassword(SignInFormDto signInFormDto);

}
