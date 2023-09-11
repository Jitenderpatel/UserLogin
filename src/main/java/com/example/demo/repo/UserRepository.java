package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.UserRegister;
@Repository
public interface UserRepository  extends JpaRepository<UserRegister, Integer> {

	 @Query(value = "select * from user_register where email =:emailAddress and password=:pwd", nativeQuery = true)
	 UserRegister findByEmailAddress(@Param("emailAddress")String emailAddress,@Param("pwd")String pwd);
}
