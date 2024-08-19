package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.RestaurantEntity;
import com.repository.RestaurantRepository;



@Controller
public class RestaurantController {

	@Autowired
	RestaurantRepository restaurantRepository;
	
	@GetMapping("/newrestaurant")
	public String newRestaurant() 
	{
		return "NewRestaurant";
	}
	
	@PostMapping("/saverestaurant")
	public String saveRestaurant(RestaurantEntity restaurantEntity) 
	{
		restaurantRepository.save(restaurantEntity);
		
		return "Success";
	}
	
	@GetMapping("/listrestaurants")
	public String listRestaurants(Model model)
	{
		List<RestaurantEntity> restaurants = restaurantRepository.findAll();
		
		model.addAttribute("restaurants",restaurants);
		
		//restaurantRepository.deleteById(restaurantId);
		return "ListRestaurant";
	}
}
