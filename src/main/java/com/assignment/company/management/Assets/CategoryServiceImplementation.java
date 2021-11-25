package com.assignment.company.management.Assets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class CategoryServiceImplementation implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> retriveAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> retriveCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public HttpStatus deleteCategory(Long id) {

        Optional<Category> cat = categoryRepository.findById(id);
        if(cat.isPresent()){
            categoryRepository.deleteById(id);
        }
        return HttpStatus.OK ;
    }

    @Override
    public Category CategoryUpdate(Long id, Category category) {
        Optional<Category> cat = categoryRepository.findById(id);
        if(cat.isPresent()){
            Category newCategory = cat.get();
            //newCategory.setId(category.getId());
            newCategory.setName(category.getName());
            newCategory.setDescription(category.getDescription());

           return categoryRepository.save(newCategory);
        }
        return null;
    }
}
