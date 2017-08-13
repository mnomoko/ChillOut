package com.chillout.backend.ChillOut.controller;

import com.chillout.backend.ChillOut.model.Category;
import com.chillout.backend.ChillOut.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.chillout.backend.ChillOut.tool.Converter.stringToLong;

/**
 * Created by mnomoko on 12/08/2017.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Category getCategory(@PathVariable String id) {
        return categoryService.getById(stringToLong(id));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Category> getCategories() {
        return categoryService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Long createCategory(@RequestParam("name") String name) {
        Category category = new Category();
        category.setCategoryName(name);
        return categoryService.create(category);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    Category updateCategory(@RequestParam("name") String name) {
        Category category = new Category();
        category.setCategoryName(name);
        return categoryService.update(category);
    }

}
