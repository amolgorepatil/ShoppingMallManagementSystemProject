package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.SownerEntity;

public interface SownerRepository extends JpaRepository<SownerEntity, Integer>{
}
