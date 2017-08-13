package com.chillout.backend.ChillOut.service;

import com.chillout.backend.ChillOut.dao.CategoryRepository;
import com.chillout.backend.ChillOut.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mnomoko on 12/08/2017.
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category getById(Long id) {
        return categoryRepository.findOne(id);
    }

    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    public Long create(Category c) {
        Category category = categoryRepository.save(c);
        return category.getId();
    }

    public Category update(Category c) {
        Category category = categoryRepository.save(c);
        return category;
    }

    public void delete(Category category) {
        categoryRepository.delete(category);
    }
}
