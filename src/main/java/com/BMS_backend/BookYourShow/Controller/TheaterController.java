package com.BMS_backend.BookYourShow.Controller;

import com.BMS_backend.BookYourShow.RequestDto.TheaterRequestDto;
import com.BMS_backend.BookYourShow.ResponseDto.TheaterResponseDto;
import com.BMS_backend.BookYourShow.Service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/theater")
public class TheaterController {
    @Autowired
    TheaterService theaterService;
    @PostMapping("/create_theater")
    public String createTheater(@RequestBody() TheaterRequestDto theaterRequestDto)
    {
        return theaterService.createTheater(theaterRequestDto);
    }

    // get theater by theaterid
    @GetMapping("/get_By_theaterId")
    public TheaterResponseDto getbyId(@RequestParam("id")int id)
    {
        return theaterService.getbyId(id);
    }

    // get all theaters

    //@GetMapping("/get_By_movie")
}
