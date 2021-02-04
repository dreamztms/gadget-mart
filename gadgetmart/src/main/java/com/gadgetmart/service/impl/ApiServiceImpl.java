package com.gadgetmart.service.impl;

import com.gadgetmart.connector.WebServiceConnector;
import com.gadgetmart.model.Order;
import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;
import com.gadgetmart.model.ProductList;
import com.gadgetmart.repository.ApiRepository;
import com.gadgetmart.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @author thilinamullewidane
 */



@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ApiRepository apiRepository;

    @Autowired
    private WebServiceConnector webServiceConnector;

    @Value("${application.api.getAbansProductList}")
    private String getAbansProductList;

    @Value("${application.api.getSoftlogicProductList}")
    private String getSoftlogicProductList;

    @Value("${application.api.getSingerProductList}")
    private String getSingerProductList;

    @Override
    public ProductList getProductList(List<ProductFilter> productFilter) throws IllegalAccessException {
        List<Product> abansProductList =  new ArrayList<>();
        List<Product> singerProductList =  new ArrayList<>();
        List<Product> softlogicProductList =  new ArrayList<>();

        ProductList response = new ProductList();

        if(productFilter.size() < 1){
            throw new IllegalAccessException("Some thing went wrong.");
        }

        for (ProductFilter productFilter1:productFilter
             ) {
            if(productFilter1.getType().equals("all")){
                softlogicProductList = webServiceConnector.getSoftlogicProductList(getApiUrl("abans"),productFilter);
                abansProductList = webServiceConnector.getAbansProductList(getApiUrl("softlogic"),productFilter);
                singerProductList= webServiceConnector.getSingerProductList(getApiUrl("singer"),productFilter);
            }

            if(productFilter1.getType().equals("abans")){
                abansProductList =  webServiceConnector.getAbansProductList(getApiUrl(productFilter1.getType()),productFilter);
            }

            if(productFilter1.getType().equals("softlogic")){
                softlogicProductList=  webServiceConnector.getSoftlogicProductList(getApiUrl(productFilter1.getType()),productFilter);
            }

            if(productFilter1.getType().equals("singer")){
                singerProductList= webServiceConnector.getSingerProductList(getApiUrl(productFilter1.getType()),productFilter);
            }
        }

        response.setAbansProductList(abansProductList);
        response.setSingerProductList(singerProductList);
        response.setSoftlogicProductList(softlogicProductList);

        return response;
    }

    @Override
    public List<Order> getOrderList(String type) {
        return apiRepository.getOrderList(type);
    }

    private URI getApiUrl(String type){
        if(type.equals("abans")){
            return UriComponentsBuilder.fromUriString(getAbansProductList)
                    .buildAndExpand()
                    .toUri();

        }
        if(type.equals("softlogic")){
            return UriComponentsBuilder.fromUriString(getSoftlogicProductList)
                    .buildAndExpand()
                    .toUri();

        }
        if(type.equals("singer")){
            return  UriComponentsBuilder.fromUriString(getSingerProductList)
                    .buildAndExpand()
                    .toUri();
        }

        return null;
    }
}
