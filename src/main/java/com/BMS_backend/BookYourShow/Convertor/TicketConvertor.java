package com.BMS_backend.BookYourShow.Convertor;

import com.BMS_backend.BookYourShow.Model.Show;
import com.BMS_backend.BookYourShow.Model.Ticket;
import com.BMS_backend.BookYourShow.ResponseDto.TicketResponseDto;

import java.util.ArrayList;
import java.util.List;

public class TicketConvertor {
    public static List<TicketResponseDto> convertEntityToDto(List<Ticket> tickets)
    {
        List<TicketResponseDto> ticketResponseDtos = new ArrayList<>();

        for(Ticket ticket:tickets)
        {
            Show show = ticket.getShow();
            TicketResponseDto ticketResponseDto= TicketResponseDto.builder().movieName(show.getMovie().getMovieName()).
                    theaterName(show.getTheater().getName()).showTime(show.getShowTime())
                    .seatNo(ticket.getAllotedSeats()).ticketAmount(ticket.getAmount()).build();
            ticketResponseDtos.add(ticketResponseDto);

        }
        return ticketResponseDtos;
    }
}
