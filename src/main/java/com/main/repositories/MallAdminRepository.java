package com.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.MallAdminEntity;

public interface MallAdminRepository  extends JpaRepository<MallAdminEntity, Integer> {

}
