package com.gadgetmart.service.impl;

import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;
import com.gadgetmart.repository.ApiRepository;
import com.gadgetmart.service.ApiService;
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
