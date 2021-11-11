package com.kaanbayindir.project.core.dataAccess;

import com.kaanbayindir.project.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
