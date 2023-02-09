package com.BMS_backend.BookYourShow.RequestDto;

import lombok.Data;

import java.util.Date;
@Data
public class MovieRequestDto {
    private String movieName;
    private int duration;
    private Date releaseDate;
}
