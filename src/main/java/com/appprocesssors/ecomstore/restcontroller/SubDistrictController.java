package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.SubCategoryProducts;
import com.appprocesssors.ecomstore.model.SubDistrict;
import com.appprocesssors.ecomstore.repository.SubCategoryProductsRepository;
import com.appprocesssors.ecomstore.repository.SubDistrictRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/subDistricts")
public class SubDistrictController {


    private SubDistrictRepository subDistrictRepository;

    public SubDistrictController(SubDistrictRepository subDistrictRepository) {
        this.subDistrictRepository = subDistrictRepository;
    }


    @GetMapping("/all")
    public List<SubDistrict> getbannersbymenuid() {
        List<SubDistrict> subDistricts = this.subDistrictRepository.findAll();

        return subDistricts;
    }


}
