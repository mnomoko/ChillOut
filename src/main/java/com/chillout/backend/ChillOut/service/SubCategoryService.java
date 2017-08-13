package com.chillout.backend.ChillOut.service;

import com.chillout.backend.ChillOut.dao.SubCategoryRepository;
import com.chillout.backend.ChillOut.model.SubCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mnomoko on 12/08/2017.
 */
@Service
public class SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    public SubCategory getById(Long id) {
        return subCategoryRepository.findOne(id);
    }

    public List<SubCategory> getAll() {
        return subCategoryRepository.findAll();
    }

    public Long create(SubCategory sc) {
        SubCategory subCategory = subCategoryRepository.save(sc);
        return subCategory.getId();
    }

    public SubCategory update(SubCategory sc) {
        SubCategory subCategory = subCategoryRepository.save(sc);
        return subCategory;
    }

    public void delete(SubCategory subCategory) {
        subCategoryRepository.delete(subCategory);
    }
}
