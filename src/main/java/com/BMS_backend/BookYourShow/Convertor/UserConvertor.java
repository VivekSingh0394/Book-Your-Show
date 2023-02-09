package com.BMS_backend.BookYourShow.Convertor;

import com.BMS_backend.BookYourShow.Model.Ticket;
import com.BMS_backend.BookYourShow.Model.User;
import com.BMS_backend.BookYourShow.ResponseDto.UserResponseDto;

import java.util.ArrayList;
import java.util.List;

public class UserConvertor {

    public static UserResponseDto convertEntityToDto(User user)
    {


        List<Ticket> usersTickets = user.getTicketList();
        List<String> seats = new ArrayList<>();
        for(Ticket ticket:usersTickets)
        {
            String seatsofusers = ticket.getAllotedSeats();
            seats.add(seatsofusers);
        }
        UserResponseDto userResponseDto = UserResponseDto.builder().userName(user.getName()).mobileNo(user.getMobile())
                .seats(seats).build();
        return userResponseDto;

    }
}
