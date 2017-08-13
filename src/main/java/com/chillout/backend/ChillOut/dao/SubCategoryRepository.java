package com.chillout.backend.ChillOut.dao;

import com.chillout.backend.ChillOut.model.SubCategory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mnomoko on 12/08/2017.
 */
public interface SubCategoryRepository extends CrudRepository<SubCategory, Long> {

    @Override
    List<SubCategory> findAll();
}
