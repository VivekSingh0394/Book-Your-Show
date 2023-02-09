package com.BMS_backend.BookYourShow.Repository;

import com.BMS_backend.BookYourShow.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByName(String name);
}
