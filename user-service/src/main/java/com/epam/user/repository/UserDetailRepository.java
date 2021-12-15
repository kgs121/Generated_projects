package com.epam.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.user.entity.UserDetail;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail, Integer>{
	public UserDetail findUserDetailByUserName(String userName);
}
