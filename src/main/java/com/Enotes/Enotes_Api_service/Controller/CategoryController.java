package com.Enotes.Enotes_Api_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
        if (isSaved) {
            return ResponseEntity.ok("Category saved successfully");
        } else {
            return ResponseEntity.badRequest().body("Failed to save category");
        }
    }

    // Get all categories
    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryservice.getAllCategories();
        return ResponseEntity.ok(categories);
    }
}
