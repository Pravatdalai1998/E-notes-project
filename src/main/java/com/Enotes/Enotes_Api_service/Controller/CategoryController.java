package com.Enotes.Enotes_Api_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import com.Enotes.Enotes_Api_service.entity.Category;
import com.Enotes.Enotes_Api_service.service.Categoryservice;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private Categoryservice categoryservice;

    // Save a new category
@PostMapping("/save-category")
public ResponseEntity<String> saveCategory(@RequestBody Category category) {
    Boolean isSaved = categoryservice.saveCategory(category);
    if (Boolean.TRUE.equals(isSaved)) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Category saved successfully");
    } else {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save category");
    }
}
    // Get all categories
    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> allcategories = categoryservice.getAllCategories();
        if (CollectionUtils.isEmpty(allcategories)) {
            return ResponseEntity.noContent().build();
        } else {
            return new ResponseEntity<>(allcategories, HttpStatus.OK);
        }
    }
}
