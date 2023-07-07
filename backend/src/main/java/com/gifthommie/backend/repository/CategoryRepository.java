package com.gifthommie.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gifthommie.backend.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}