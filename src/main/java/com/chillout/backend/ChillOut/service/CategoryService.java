package com.chillout.backend.ChillOut.service;

import com.chillout.backend.ChillOut.dao.CategoryRepository;
import com.chillout.backend.ChillOut.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mnomoko on 12/08/2017.
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category getCategoryById(Long id) {
        return categoryRepository.findOne(id);
    }
}
