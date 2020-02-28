package com.example.Recomendationservice.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Movieservice.model.Movie;

@RestController
public class Recomcontroller {
	@Autowired
	RestTemplate resttemplate;
	
	 @RequestMapping(value = "/recommendations", method = RequestMethod.GET)
    @ResponseBody
    public Movie[] recommendations() {
        Movie[] result = resttemplate.getForObject("http://movie-service/movies", Movie[].class);
        return result;
    }
}
