package com.vishnu.Restaurant.controller;

import com.vishnu.Restaurant.entities.Restaurant;
import com.vishnu.Restaurant.entities.Speciality;
import com.vishnu.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
	@Autowired
	RestaurantService restaurantService;

	@PostMapping("api/v1/restaurant")
	public String addRestaurant(@RequestBody Restaurant restaurantItem){
		return restaurantService.addRestaurant(restaurantItem);
	}

	@GetMapping("api/v1/restaurants")
	public List<Restaurant> getRestaurantList(){
		return restaurantService.getRestaurantList();
	}

	@GetMapping("api/v1/restaurant/{id}")
	public Object getRestaurantWithId(@PathVariable Integer id){
		return restaurantService.getRestaurantById(id);
	}

	@PutMapping("api/v1/restaurants/{id}")
	public String updateRestaurant(@RequestParam Speciality speciality,@PathVariable Integer id){
		return restaurantService.updateRestaurantSpeciality(speciality,id);
	}

	@DeleteMapping("api/v1/restaurants/{id}")
	public String deleteRestaurant(@PathVariable Integer id){
		return restaurantService.deleteRestaurantItem(id);
	}
}
