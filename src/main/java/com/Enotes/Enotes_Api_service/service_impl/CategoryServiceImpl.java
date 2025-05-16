package com.Enotes.Enotes_Api_service.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Enotes.Enotes_Api_service.entity.Category;
import com.Enotes.Enotes_Api_service.repository.Categoryrepository;
import com.Enotes.Enotes_Api_service.service.Categoryservice;

@Service
public class CategoryServiceImpl implements Categoryservice {

    @Autowired
    private Categoryrepository categoryrepository;

    @Override
    public Boolean saveCategory(Category category) {
        Category savedCategory = categoryrepository.save(category); 
        return savedCategory != null; 
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryrepository.findAll(); 
    }
}
