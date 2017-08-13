package com.chillout.backend.ChillOut.controller;

import com.chillout.backend.ChillOut.model.Category;
import com.chillout.backend.ChillOut.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.chillout.backend.ChillOut.tool.Converter.stringToLong;

/**
 * Created by mnomoko on 12/08/2017.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/{id}")
    Category getCategory(@PathVariable String id) {
        return categoryService.getCategoryById(stringToLong(id));
        //return categoryService.getCategoryById(id);
    }
}
