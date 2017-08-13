package com.chillout.backend.ChillOut.controller;

import com.chillout.backend.ChillOut.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mnomoko on 12/08/2017.
 */
@RestController
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;
}
