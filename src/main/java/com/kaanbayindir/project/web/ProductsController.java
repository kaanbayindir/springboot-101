package com.kaanbayindir.project.web;

import com.kaanbayindir.project.business.abstracts.ProductService;
import com.kaanbayindir.project.core.utilities.results.DataResult;
import com.kaanbayindir.project.core.utilities.results.Result;
import com.kaanbayindir.project.entities.concretes.Product;
import com.kaanbayindir.project.entities.dtos.ProductWithCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {


    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {

        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {

        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getbyproductnameandcategoryid")
    public DataResult<Product> getByProductNameAndCategory(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId) {
        return this.productService.getByProductNameAndCategory(productName, categoryId);
    }

    @GetMapping("/getbyproductnamecontains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getbycategoryin")
    public DataResult<List<Product>> getByCategoryIdIn(@RequestParam List<Integer> categories) {
        return this.productService.getByCategory_IdIn(categories);
    }

    @GetMapping("/getAllByPage")
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {

        return this.productService.getAll(pageNo, pageSize);
    }

    @GetMapping("/getAllDesc")
    public DataResult<List<Product>> getAllSorted() {

        return this.productService.getAllSorted();
    }

    @GetMapping("/getProductWithCategoryDetails")
    public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
        return this.productService.getProductWithCategoryDetails();
    }
}

