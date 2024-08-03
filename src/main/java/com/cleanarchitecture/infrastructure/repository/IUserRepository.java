package com.cleanarchitecture.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleanarchitecture.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByUserName(String username);
}
