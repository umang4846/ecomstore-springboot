package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.TrendingHome;
import com.appprocesssors.ecomstore.model.TrendingSubCategory;
import com.appprocesssors.ecomstore.repository.TrendingHomeRepository;
import com.appprocesssors.ecomstore.repository.TrendingSubCategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subCategoryTrending")
public class TrendingSubCategoryController {


    private TrendingSubCategoryRepository trendingSubCategoryRepository;

    public TrendingSubCategoryController(TrendingSubCategoryRepository trendingSubCategoryRepository) {
        this.trendingSubCategoryRepository = trendingSubCategoryRepository;
    }


    @GetMapping("/{menuid}")
    public List<TrendingSubCategory> getAllUsers(@PathVariable String menuid) {
        List<TrendingSubCategory> trending = this.trendingSubCategoryRepository.findAllByMenuid(menuid);

        return trending;
    }


}
