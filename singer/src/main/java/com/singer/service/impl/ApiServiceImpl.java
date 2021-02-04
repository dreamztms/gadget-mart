package com.singer.service.impl;

import com.singer.model.Product;
import com.singer.model.ProductFilter;
import com.singer.repository.ApiRepository;
import com.singer.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author thilinamullewidane
 */

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ApiRepository apiRepository;

    @Override
    public List<Product> getProductList(List<ProductFilter> productFilter) {
        return apiRepository.getProductList(productFilter);
    }
}
