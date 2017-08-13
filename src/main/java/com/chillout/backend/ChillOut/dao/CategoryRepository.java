package com.chillout.backend.ChillOut.dao;

import com.chillout.backend.ChillOut.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mnomoko on 12/08/2017.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    @Override
    List<Category> findAll();
}
