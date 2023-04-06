package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.ShopEntity;

public interface ShopRepository extends JpaRepository<ShopEntity, Integer> {

}
