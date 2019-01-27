package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.BannerHome;
import com.appprocesssors.ecomstore.model.CategoryHome;
import com.appprocesssors.ecomstore.repository.BannerHomeRepository;
import com.appprocesssors.ecomstore.repository.CategoryHomeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categoryHome")
public class CategoryHomeController {


    private CategoryHomeRepository categoryHomeRepository;

    public CategoryHomeController(CategoryHomeRepository categoryHomeRepository) {
        this.categoryHomeRepository = categoryHomeRepository;
    }


    @GetMapping()
    public List<CategoryHome> getAllCategory() {
        List<CategoryHome> category = this.categoryHomeRepository.findAll();

        return category;
    }
}
