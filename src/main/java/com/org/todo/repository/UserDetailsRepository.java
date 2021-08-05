package com.org.todo.repository;

import com.org.todo.entity.UserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity,Long> {
}
