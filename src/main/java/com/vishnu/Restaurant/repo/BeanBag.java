package com.vishnu.Restaurant.repo;

import com.vishnu.Restaurant.entities.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanBag {
	@Bean
	public List<Restaurant> getRestaurantList(){
		return new ArrayList<>();
	}
}
