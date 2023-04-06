package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.OrderDetailsEntity;

public interface OrderDeatilsRepository extends JpaRepository<OrderDetailsEntity, Integer> {

}
