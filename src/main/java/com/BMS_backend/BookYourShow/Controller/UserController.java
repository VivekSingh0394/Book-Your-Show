package com.BMS_backend.BookYourShow.Controller;

import com.BMS_backend.BookYourShow.RequestDto.UserRequestDto;
import com.BMS_backend.BookYourShow.ResponseDto.TicketResponseDto;
import com.BMS_backend.BookYourShow.ResponseDto.UserResponseDto;
import com.BMS_backend.BookYourShow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody() UserRequestDto userRequestDto)
    {
        String result=userService.addUser(userRequestDto);
        return result;
    }

    @GetMapping("getAll_user_tickets")
    public List<TicketResponseDto> getAllTicketsBookedByUser(@RequestParam("id")int userId)
    {
        return userService.getAllUserBookedTicketsInfo(userId);
    }


    @GetMapping("/get_user_by_name")
    public UserResponseDto findByName(@RequestParam("name")String name)
    {
        return userService.getUserByName(name);
    }
}
