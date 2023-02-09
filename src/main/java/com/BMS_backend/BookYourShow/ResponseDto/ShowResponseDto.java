package com.BMS_backend.BookYourShow.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowResponseDto {
    private LocalDate showDate;
    private LocalTime showTime;
    private String movieName;
}
