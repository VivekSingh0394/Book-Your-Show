package com.BMS_backend.BookYourShow.Controller;

import com.BMS_backend.BookYourShow.RequestDto.BookTicketRequestDto;
import com.BMS_backend.BookYourShow.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;
    @PostMapping("/book")
    public String bookTicket(@RequestBody()BookTicketRequestDto bookTicketRequestDto)
    {
   try
   {
       return ticketService.bookTicket(bookTicketRequestDto);
   }
   catch (Exception e)
   {
       return "requested seats are not available!";
   }
    }
    @PostMapping("cancel")
    public int canTicket(@RequestParam("id")int ticketId)
    {
        return ticketService.cancelTicket(ticketId);
    }
}
