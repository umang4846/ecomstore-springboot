package com.appprocesssors.ecomstore.restcontroller;

import com.appprocesssors.ecomstore.model.ProductDetails;
import com.appprocesssors.ecomstore.model.ProductList;
import com.appprocesssors.ecomstore.repository.ProductDetailsRepository;
import com.appprocesssors.ecomstore.repository.ProductListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fragrances")
public class ProductListController {


    @Autowired
    private ProductListRepository productListRepository;

    public ProductListController(ProductListRepository productListRepository) {
        this.productListRepository = productListRepository;
    }

    @GetMapping(value = "/{menuid}", params = { "page", "size","sortby" })
    public Page<ProductList> getproductbymenuid(
            @PathVariable("menuid") String menuid,
            @RequestParam( "page" ) int page,
            @RequestParam( "size" ) int size,
            @RequestParam( "sortby" ) String sortby
    ) {
        Page<ProductList> productLists = this.productListRepository.findAllByMenuid(menuid,PageRequest.of(page,size, Sort.Direction.ASC ,sortby));

        return productLists;
    }


    @GetMapping(value = "/{menuid}/desc", params = { "page", "size","sortby" })
    public Page<ProductList> getproductbymenuidDESC(
            @PathVariable("menuid") String menuid,
            @RequestParam( "page" ) int page,
            @RequestParam( "size" ) int size,
            @RequestParam( "sortby" ) String sortby
    ) {
        Page<ProductList> productLists = this.productListRepository.findAllByMenuid(menuid,PageRequest.of(page,size, Sort.Direction.DESC ,sortby));

        return productLists;
    }

    @GetMapping("/all")
    public List<ProductList> allproducts (){
        List<ProductList> productLists = this.productListRepository.findAll();
        return  productLists;
    }

}
