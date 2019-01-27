package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.SubCategoryProducts;
import com.appprocesssors.ecomstore.repository.SubCategoryProductsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subCategoryProducts")
public class SubCategoryProductsController {


    private SubCategoryProductsRepository subCategoryProductsRepository;

    public SubCategoryProductsController(SubCategoryProductsRepository subCategoryProductsRepository) {
        this.subCategoryProductsRepository = subCategoryProductsRepository;
    }


    @GetMapping("/{menuid}")
    public List<SubCategoryProducts> getbannersbymenuid(@PathVariable("menuid") String menuid) {
        List<SubCategoryProducts> subCategoryProducts = this.subCategoryProductsRepository.findAllByMenuid(menuid);

        return subCategoryProducts;
    }

    @GetMapping("/all")
    public List<SubCategoryProducts> getAllSubcategory() {
        List<SubCategoryProducts> subCategoryProducts = this.subCategoryProductsRepository.findAll();

        return subCategoryProducts;
    }


}
