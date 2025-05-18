package com.Enotes.Enotes_Api_service.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.Enotes.Enotes_Api_service.entity.Category;
import com.Enotes.Enotes_Api_service.repository.Categoryrepository;
import com.Enotes.Enotes_Api_service.service.Categoryservice;

@Service
public class CategoryServiceImpl implements Categoryservice {

    @Autowired
    private Categoryrepository categoryrepository;

@Override
public Boolean saveCategory(Category category) {
    category.setIsDeleted(false);
    category.setCreatedBy(1);
    Category savedCategory = categoryrepository.save(category); 
    if (ObjectUtils.isEmpty(savedCategory)) {
        return false;  
    }
    return true;  
}
    @Override
    public List<Category> getAllCategories() {
        List<Category> categories = categoryrepository.findAll();
        return categories;
    }
}
