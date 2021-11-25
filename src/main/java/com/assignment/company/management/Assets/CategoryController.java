package com.assignment.company.management.Assets;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryServiceImplementation categoryServiceImplementation;


    // Get all Category from database
    @GetMapping("/category")
    public List<Category> getAllCategory(){
        return categoryServiceImplementation.retriveAllCategories();
    }

    // Get category by ID
    @GetMapping("/category/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id){
        return categoryServiceImplementation.retriveCategoryById(id);
    }

    // Add category in database
    @PostMapping("/category")
    public Category createCategory(@RequestBody Category category){
        return categoryServiceImplementation.createCategory(category);
    }
    // Update category by ID
    @PutMapping("/category/{id}")
    public Category updateCategory(@PathVariable Long id,@RequestBody Category category){
        return categoryServiceImplementation.CategoryUpdate(id, category);
    }
    // Delete category by ID
    @DeleteMapping("/category/{id}")
    public HttpStatus deleteCategory (Long id){

        return categoryServiceImplementation.deleteCategory(id);
    }
}
