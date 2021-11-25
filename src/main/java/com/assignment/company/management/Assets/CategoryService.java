package com.assignment.company.management.Assets;

import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    Category createCategory(Category category);
    List<Category> retriveAllCategories();
    Optional<Category> retriveCategoryById(Long id);
    HttpStatus deleteCategory(Long id);
    Category CategoryUpdate(Long id, Category category);
}
