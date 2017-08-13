package com.chillout.backend.ChillOut.controller;

import com.chillout.backend.ChillOut.model.Category;
import com.chillout.backend.ChillOut.model.SubCategory;
import com.chillout.backend.ChillOut.service.CategoryService;
import com.chillout.backend.ChillOut.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.chillout.backend.ChillOut.tool.Converter.stringToLong;

/**
 * Created by mnomoko on 12/08/2017.
 */
@RestController
@RequestMapping("/sub_category")
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    SubCategory getSubCategory(@PathVariable("id") String id) {
        return subCategoryService.getById(stringToLong(id));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<SubCategory> getSubCategories() {
        return subCategoryService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Long createSubCategory(@RequestParam("name") String name, @RequestParam("idCategory") String idCategory) {

        Category category = categoryService.getById(stringToLong(idCategory));

        SubCategory subCategory = new SubCategory();
        subCategory.setSubCategoryName(name);
        subCategory.setCategory(category);
        return subCategoryService.create(subCategory);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    SubCategory updateSubCategory(@RequestParam("name") String name, @RequestParam("idCategory") String idCategory) {

        Category category = categoryService.getById(stringToLong(idCategory));

        SubCategory subCategory = new SubCategory();
        subCategory.setSubCategoryName(name);
        subCategory.setCategory(category);
        return subCategoryService.update(subCategory);
    }
}
