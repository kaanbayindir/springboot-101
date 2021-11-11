package com.kaanbayindir.project.business.abstracts;

import com.kaanbayindir.project.core.utilities.results.DataResult;
import com.kaanbayindir.project.core.utilities.results.Result;
import com.kaanbayindir.project.entities.concretes.Product;
import com.kaanbayindir.project.entities.dtos.ProductWithCategoryDto;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAllSorted();
    DataResult<List<Product>> getAll(int pageNo,int pageSize);
    Result add(Product product);

    DataResult<Product> getByProductName(String productName);

    DataResult<Product> getByProductNameAndCategory(String productName,int categoryId);

    DataResult<List<Product>> getByProductNameOrCategory(String productName,int categoryId);

    DataResult<List<Product>> getByCategory_IdIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();




}
