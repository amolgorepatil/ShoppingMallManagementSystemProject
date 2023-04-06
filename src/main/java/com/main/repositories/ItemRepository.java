package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Long>
{

}
