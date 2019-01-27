package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.BannerCategoryProducts;
import com.appprocesssors.ecomstore.model.BannerHome;
import com.appprocesssors.ecomstore.repository.BannerCategoryProductsRepository;
import com.appprocesssors.ecomstore.repository.BannerHomeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bannerCategoryProducts")
public class BannerCategoryProductsController {


    private BannerCategoryProductsRepository bannerCategoryProductsRepository;

    public BannerCategoryProductsController(BannerCategoryProductsRepository bannerCategoryProductsRepository) {
        this.bannerCategoryProductsRepository = bannerCategoryProductsRepository;
    }


    @GetMapping("/{menuid}")
    public List<BannerCategoryProducts> getbannersbymenuid(@PathVariable("menuid") String menuid) {
        List<BannerCategoryProducts> bannerscategory = this.bannerCategoryProductsRepository.findAllByMenuid(menuid);

        return bannerscategory;
    }

    @GetMapping("/all")
    public List<BannerCategoryProducts> getAllCategoryBaners() {
        List<BannerCategoryProducts> bannerscategory = this.bannerCategoryProductsRepository.findAll();

        return bannerscategory;
    }

}
