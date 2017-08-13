package com.chillout.backend.ChillOut.service;

import com.chillout.backend.ChillOut.dao.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mnomoko on 12/08/2017.
 */
@Service
public class SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;
}
