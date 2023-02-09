package com.BMS_backend.BookYourShow.Service;

import com.BMS_backend.BookYourShow.Convertor.TicketConvertor;
import com.BMS_backend.BookYourShow.Convertor.UserConvertor;
import com.BMS_backend.BookYourShow.Model.Ticket;
import com.BMS_backend.BookYourShow.Model.User;
import com.BMS_backend.BookYourShow.Repository.UserRepository;
import com.BMS_backend.BookYourShow.RequestDto.UserRequestDto;
import com.BMS_backend.BookYourShow.ResponseDto.TicketResponseDto;
import com.BMS_backend.BookYourShow.ResponseDto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(UserRequestDto userRequestDto)
    {
        User user = User.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();
        try{
            userRepository.save(user);

        }catch(Exception e){
            return "user couldnt be added";
        }
        return "user added succesfully";
    }

    public List<TicketResponseDto> getAllUserBookedTicketsInfo(int userId)
    {
        User user= userRepository.findById(userId).get();
        List<Ticket> userTickets = user.getTicketList();
        List<TicketResponseDto> ticketResponseDtos = new ArrayList<>();

        ticketResponseDtos= TicketConvertor.convertEntityToDto(userTickets);
        return ticketResponseDtos;

    }
    public UserResponseDto getUserByName(String name)
    {
        User user = userRepository.findUserByName(name);
        UserResponseDto userResponseDto = UserConvertor.convertEntityToDto(user);
        return  userResponseDto;
    }

}
