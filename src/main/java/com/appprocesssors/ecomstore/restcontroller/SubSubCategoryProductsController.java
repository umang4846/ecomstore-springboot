package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.SubCategoryProducts;
import com.appprocesssors.ecomstore.model.SubSubCategoryProducts;
import com.appprocesssors.ecomstore.repository.SubCategoryProductsRepository;
import com.appprocesssors.ecomstore.repository.SubSubCategoryProductsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subSubCategoryProducts")
public class SubSubCategoryProductsController {


    private SubSubCategoryProductsRepository subSubCategoryProductsRepository;

    public SubSubCategoryProductsController(SubSubCategoryProductsRepository subSubCategoryProductsRepository) {
        this.subSubCategoryProductsRepository = subSubCategoryProductsRepository;
    }


    @GetMapping("/{menuid}")
    public List<SubSubCategoryProducts> getbannersbymenuid(@PathVariable("menuid") String menuid) {
        List<SubSubCategoryProducts> subCategoryProducts = this.subSubCategoryProductsRepository.findAllByMenuid(menuid);

        return subCategoryProducts;
    }

    @GetMapping("/all")
    public List<SubSubCategoryProducts> getAllSubcategory() {
        List<SubSubCategoryProducts> subCategoryProducts = this.subSubCategoryProductsRepository.findAll();

        return subCategoryProducts;
    }


}
