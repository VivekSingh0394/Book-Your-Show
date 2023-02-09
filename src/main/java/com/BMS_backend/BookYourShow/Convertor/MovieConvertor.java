package com.BMS_backend.BookYourShow.Convertor;

import com.BMS_backend.BookYourShow.Model.Movie;
import com.BMS_backend.BookYourShow.Model.Show;
import com.BMS_backend.BookYourShow.ResponseDto.MovieResponseDto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MovieConvertor {
    public static List<MovieResponseDto> convertEntityToDto(Movie movie)
    {
        List<MovieResponseDto> movieResponseDtos = new ArrayList<>();

        List<Show> showList = movie.getShowList();
        for(Show show:showList)
        {
            LocalTime time = show.getShowTime();
            LocalDate date = show.getShowDate();
            String theaterName = show.getTheater().getName();
               String address=   show.getTheater().getAddress();
                 String city= show.getTheater().getCity();
            double multiplier = show.getMultiplier();

            MovieResponseDto movieResponseDto = MovieResponseDto.builder().releaseDate(movie.getReleaseDate()).duration(movie.getDuration())
                    .multiplier(multiplier).ShowDate(date).showTime(time).theater(theaterName).address(address).city(city).build();
            movieResponseDtos.add(movieResponseDto);

        }

        return movieResponseDtos;




    }
}
