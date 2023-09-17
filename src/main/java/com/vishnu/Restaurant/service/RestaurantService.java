package com.vishnu.Restaurant.service;

import com.vishnu.Restaurant.entities.Restaurant;
import com.vishnu.Restaurant.entities.Speciality;
import com.vishnu.Restaurant.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
	@Autowired
	RestaurantRepo restaurantRepo;

	public String addRestaurant(Restaurant restaurantItem) {
		restaurantRepo.getRestaurantList().add(restaurantItem);
		return "1 restaurant added";
	}

	public List<Restaurant> getRestaurantList() {
		return restaurantRepo.getRestaurantList();
	}

	public Object getRestaurantById(Integer id) {
		for (Restaurant restaurant:restaurantRepo.getRestaurantList()) {
			if (restaurant.getId().equals(id)){
				return restaurant;
			}
		}
		return "restaurant not found";
	}

	public String updateRestaurantSpeciality(Speciality speciality,Integer id) {
		for (Restaurant restaurant:restaurantRepo.getRestaurantList()) {
			if (restaurant.getId().equals(id)){
				restaurant.setRestaurantSpeciality(speciality);
				return "restaurant with id: "+id+" is updated!!";
			}
		}
		return "Invalid Id";
	}

	public String deleteRestaurantItem(Integer id) {
		for (Restaurant restaurant:restaurantRepo.getRestaurantList()) {
			if (restaurant.getId().equals(id)){
				restaurantRepo.getRestaurantList().remove(restaurant);
				return "restaurant with id: "+id+" is deleted!!";
			}
		}
		return "Invalid Id";
	}
}
