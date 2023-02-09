package com.BMS_backend.BookYourShow.Repository;

import com.BMS_backend.BookYourShow.Model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends JpaRepository<Theater,Integer> {
    Theater findByNameAndCity(String name,String city);
    Theater findTheaterById(int id);
}
