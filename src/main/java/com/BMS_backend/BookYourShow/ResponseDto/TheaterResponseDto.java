package com.BMS_backend.BookYourShow.ResponseDto;

import com.BMS_backend.BookYourShow.Model.Show;
import com.BMS_backend.BookYourShow.Model.TheaterSeat;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheaterResponseDto {

    private String name;
    private String city;
    private String address;

   private List<String> movieName;
}
