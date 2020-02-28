package com.example.Movieservice.Rest;

import java.util.ArrayList;
import java.util.List;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movieservice.model.Movie;

@RestController
public class Controller {
	
	
	
	private static List<Movie> movieList=new ArrayList<>();
	static
			{
				movieList.add(new Movie(1,"movie1","summary:1"));
				movieList.add(new Movie(2,"movie2","summary:2"));
				movieList.add(new Movie(3,"movie3","summary:3"));
			}
@GetMapping("/movies")
public ResponseEntity<?> getMovies()
{
	return ResponseEntity.ok(movieList);
}

@GetMapping("/movies/{id}")
public ResponseEntity<?> getMovie(@PathVariable int id)
{
	Movie movie=findMovie(id);
	if(movie==null)
	{
		return ResponseEntity.badRequest().body("Invalid movie id");
	}
	return ResponseEntity.ok(movie);
}

private Movie findMovie(int id) {
    return movieList.stream()
        .filter(movie -> movie.getId()
            .equals(id))
        .findFirst()
        .orElse(null);
}


}
