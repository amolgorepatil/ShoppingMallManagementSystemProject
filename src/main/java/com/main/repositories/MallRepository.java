package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.MallEntity;

public interface MallRepository extends JpaRepository<MallEntity, Long> {

	

}
