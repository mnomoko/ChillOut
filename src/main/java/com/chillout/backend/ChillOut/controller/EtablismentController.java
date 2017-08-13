package com.chillout.backend.ChillOut.controller;

import com.chillout.backend.ChillOut.model.Etablisment;
import com.chillout.backend.ChillOut.model.SubCategory;
import com.chillout.backend.ChillOut.service.EtablismentService;
import com.chillout.backend.ChillOut.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.chillout.backend.ChillOut.tool.Converter.stringToLong;

/**
 * Created by mnomoko on 12/08/2017.
 */
@RestController
@RequestMapping("/etablisment")
public class EtablismentController {

    @Autowired
    private SubCategoryService subCategoryService;

    @Autowired
    private EtablismentService etablismentService;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Etablisment getEtablismentById(@RequestParam("id") String id) {
        return etablismentService.getById(stringToLong(id));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Etablisment> getEtablisments() {
        return etablismentService.getAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    Long createEtablisment(@RequestParam("name") String name, @RequestParam("idCategory") String idSubCategory,
                            @RequestParam("siren") String siren, @RequestParam("address") String address,
                            @RequestParam("city") String city, @RequestParam("cp") String cp,
                            @RequestParam("longitude") String longitude, @RequestParam("lattitude") String lattitude
    ) {

        SubCategory subCategory = subCategoryService.getById(stringToLong(idSubCategory));

        Etablisment etablisment = new Etablisment();
        etablisment.setName(name);

        etablisment.setSiren(siren);
        etablisment.setAddress(address);
        etablisment.setCity(city);
        etablisment.setCp(cp);
        etablisment.setLongitude(longitude);
        etablisment.setLattitude(lattitude);

        etablisment.setSubCategory(subCategory);
        return etablismentService.create(etablisment);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    Etablisment updateEtablisment(@RequestParam("name") String name, @RequestParam("idSubCategory") String idSubCategory) {

        SubCategory subCategory = subCategoryService.getById(stringToLong(idSubCategory));

        Etablisment etablisment = new Etablisment();
        etablisment.setName(name);
        etablisment.setSubCategory(subCategory);
        return etablismentService.update(etablisment);
    }
        
}
