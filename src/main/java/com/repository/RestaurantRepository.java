package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.RestaurantEntity;
import org.springframework.stereotype.Repository;


@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {

}