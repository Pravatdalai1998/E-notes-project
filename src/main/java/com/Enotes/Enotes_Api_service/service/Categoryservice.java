package com.Enotes.Enotes_Api_service.service;

import java.util.List;
import com.Enotes.Enotes_Api_service.entity.Category;

public interface Categoryservice {
    Boolean saveCategory(Category category);
    List<Category> getAllCategories();
}

