package com.imannrhman.auth_service.repository;

import com.imannrhman.auth_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findUsersByUsername(String username);
}
