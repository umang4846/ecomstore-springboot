package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.BannerHome;
import com.appprocesssors.ecomstore.model.TrendingHome;
import com.appprocesssors.ecomstore.repository.BannerHomeRepository;
import com.appprocesssors.ecomstore.repository.TrendingHomeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/trendingHome")
public class TrendingHomeController {


    private TrendingHomeRepository trendingHomeRepository;

    public TrendingHomeController(TrendingHomeRepository trendingHomeRepository) {
        this.trendingHomeRepository = trendingHomeRepository;
    }


    @GetMapping()
    public List<TrendingHome> getAllUsers() {
        List<TrendingHome> trending = this.trendingHomeRepository.findAll();

        return trending;
    }


}
