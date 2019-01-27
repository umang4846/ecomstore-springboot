package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.BannerHome;
import com.appprocesssors.ecomstore.repository.BannerHomeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bannerHome")
public class BannerHomeController {


    private BannerHomeRepository bannerHomeRepository;

    public BannerHomeController(BannerHomeRepository bannerHomeRepository) {
        this.bannerHomeRepository = bannerHomeRepository;
    }


    @GetMapping("/topbanners")
    public List<BannerHome> getAllUsers() {
        List<BannerHome> banners = this.bannerHomeRepository.findAll();

        return banners;
    }


}
