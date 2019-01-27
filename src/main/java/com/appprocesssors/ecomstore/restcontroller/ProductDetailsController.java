package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.ProductDetails;
import com.appprocesssors.ecomstore.repository.ProductDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.JsonPath;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fragrances")
public class ProductDetailsController {


    @Autowired
    private ProductDetailsRepository productDetailsRepository;

    public ProductDetailsController(ProductDetailsRepository productDetailsRepository) {
        this.productDetailsRepository = productDetailsRepository;
    }

    @GetMapping("/productDetailsByProductCode/{productCode}")
    public ProductDetails getProductByProductCode(@PathVariable String productCode){
        ProductDetails productDetails = this.productDetailsRepository.findFirstByProductCode(productCode);
        return productDetails;
    }


}
