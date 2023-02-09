package com.BMS_backend.BookYourShow.Service;

import com.BMS_backend.BookYourShow.Convertor.MovieConvertor;
import com.BMS_backend.BookYourShow.Model.Movie;
import com.BMS_backend.BookYourShow.Model.Show;
import com.BMS_backend.BookYourShow.Model.Theater;
import com.BMS_backend.BookYourShow.Repository.MovieRepository;
import com.BMS_backend.BookYourShow.RequestDto.MovieRequestDto;
import com.BMS_backend.BookYourShow.ResponseDto.MovieResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieRequestDto movieRequestDto)
    {
        Movie movie= Movie.builder().movieName(movieRequestDto.getMovieName()).duration(movieRequestDto.getDuration())
                .releaseDate(movieRequestDto.getReleaseDate()).build();
        movieRepository.save(movie);
        return "movie added successfully";
    }
    public List<String> getListOfTheatersForAMovie(String movieName)
    {
        Movie movie = movieRepository.findByMovieName(movieName);
        List<Show> showEntityList = movie.getShowList();
        List<String> theaterList = new ArrayList<>();
        for(Show show:showEntityList)
        {
            Theater theater = show.getTheater();
            String theaterName = theater.getName();
            theaterList.add(theaterName);
        }
        return theaterList;

    }

    public List<MovieResponseDto> getMovieByName(String movieName)
    {
        Movie movie = movieRepository.findByMovieName(movieName);
        List<MovieResponseDto> movieResponseDtoList = MovieConvertor.convertEntityToDto(movie);

        return  movieResponseDtoList;
    }
}
