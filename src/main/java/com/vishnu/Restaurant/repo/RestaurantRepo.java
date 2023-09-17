package com.vishnu.Restaurant.repo;

import com.vishnu.Restaurant.entities.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {
	@Autowired
	private List<Restaurant> restaurantList;

	public List<Restaurant> getRestaurantList() {
		return restaurantList;
	}
}
