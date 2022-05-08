package com.example.shopdatabase.repository;

import com.example.shopdatabase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value="SELECT * FROM user WHERE username=?1",nativeQuery = true)
    User getUserByUsername(String username);

    @Query(value="SELECT * FROM user WHERE user_id=?1",nativeQuery = true)
    User getUserByID(Long id);
}