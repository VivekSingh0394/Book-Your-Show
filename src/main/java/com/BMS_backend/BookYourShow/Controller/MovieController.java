package com.BMS_backend.BookYourShow.Controller;

import com.BMS_backend.BookYourShow.RequestDto.MovieRequestDto;
import com.BMS_backend.BookYourShow.ResponseDto.MovieResponseDto;
import com.BMS_backend.BookYourShow.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public String addMovie(@RequestBody() MovieRequestDto movieRequestDto) {
        return movieService.addMovie(movieRequestDto);
    }

    // get movie by name
    @GetMapping("/get_Movie_ByName")
    public List<MovieResponseDto> getMovieByName(@RequestParam("name")String movieName)
    {
              return movieService.getMovieByName(movieName);
    }


    @GetMapping("/get_list_of_Theaters")
    public List<String> getListOfTheaters(@RequestParam("movie") String movieName) {
        return movieService.getListOfTheatersForAMovie(movieName);


    }
}

