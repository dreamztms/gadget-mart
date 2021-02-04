package com.softlogic.service.impl;

import com.softlogic.model.Product;
import com.softlogic.model.ProductFilter;
import com.softlogic.repository.ApiRepository;
import com.softlogic.service.ApiService;
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
