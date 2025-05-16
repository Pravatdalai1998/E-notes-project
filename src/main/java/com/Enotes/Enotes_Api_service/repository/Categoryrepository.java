package com.Enotes.Enotes_Api_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Enotes.Enotes_Api_service.entity.Category;

@Repository
public interface Categoryrepository extends JpaRepository<Category, Long> {
}
