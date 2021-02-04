package com.abans.service.impl;

import com.abans.model.Product;
import com.abans.model.ProductFilter;
import com.abans.repository.ApiRepository;
import com.abans.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ApiRepository apiRepository;

    @Override
    public List<Product> getProductList(List<ProductFilter> productFilter) {
        return apiRepository.getProductList(productFilter);
    }
}
