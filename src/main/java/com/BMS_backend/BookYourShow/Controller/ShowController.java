package com.BMS_backend.BookYourShow.Controller;

import com.BMS_backend.BookYourShow.RequestDto.ShowRequestDto;
import com.BMS_backend.BookYourShow.ResponseDto.ShowResponseDto;
import com.BMS_backend.BookYourShow.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/show")
public class ShowController {
    @Autowired
    ShowService showService;
    @PostMapping("/add")
    public String addShow(@RequestBody() ShowRequestDto showRequestDto)
    {
        return showService.addShow(showRequestDto);

    }
    @GetMapping("get_all_shows")
    public List<ShowResponseDto> getAllShowsOfAMovie(@RequestParam("id")int movieId)
    {
        return showService.getAllShowsForAMovie(movieId);

    }
}
