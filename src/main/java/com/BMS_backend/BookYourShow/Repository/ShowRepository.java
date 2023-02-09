package com.BMS_backend.BookYourShow.Repository;

import com.BMS_backend.BookYourShow.Model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show,Integer> {
}
