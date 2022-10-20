package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * ALE IS TER
 * 10/16/2022
 * 9:33 AM
 * Spring-Boot-Demo-Test
 * com.example.demo.repo
 * UserRepo
 */
public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value = "SELECT * FROM user WHERE id= ?1",nativeQuery = true)
    User getUserByUserID(String id);
    @Query(value = "SELECT * FROM user WHERE id= ?1 AND address=?2",nativeQuery = true)
    User getUserByUserIdAndAddress(String id , String address);
    @Modifying
    @Query(value = "UPDATE user SET name=?1 WHERE id= ?2",nativeQuery = true)
    int updateUserNameById(String name , String id);
}
