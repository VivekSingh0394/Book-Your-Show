package com.BMS_backend.BookYourShow.ResponseDto;

import com.BMS_backend.BookYourShow.Enum.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketResponseDto {
    private String movieName;
    private String theaterName;
    private LocalTime showTime;
    private String seatNo;
    private SeatType seatType;
    private int ticketAmount;
}

