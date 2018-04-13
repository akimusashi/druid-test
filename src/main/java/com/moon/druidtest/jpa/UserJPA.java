package com.moon.druidtest.jpa;

import com.moon.druidtest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserJPA extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User>, Serializable {
}
