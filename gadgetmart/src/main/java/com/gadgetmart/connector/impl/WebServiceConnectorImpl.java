package com.gadgetmart.connector.impl;

import com.gadgetmart.connector.WebServiceConnector;
import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

/**
 * @author thilinamullewidane
 */

@Component
public class WebServiceConnectorImpl implements WebServiceConnector {


    @Autowired
    RestTemplate restTemplate;


    @Override
    public List<Product> getSoftlogicProductList(URI softlogicWebServiceUri, List<ProductFilter> productFilter) {
        System.out.println(softlogicWebServiceUri);
        System.out.println(restTemplate);
        try {
            ResponseEntity<List<Product>> responseEntity = restTemplate.exchange(softlogicWebServiceUri, HttpMethod.POST,new HttpEntity<>(productFilter),
                    new ParameterizedTypeReference<List<Product>>() {
                    });

            return responseEntity.getBody();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Product> getAbansProductList(URI abansWebServiceUri , List<ProductFilter> productFilter) {
        System.out.println(abansWebServiceUri);
        try {
            ResponseEntity<List<Product>> responseEntity = restTemplate.exchange(abansWebServiceUri, HttpMethod.POST,new HttpEntity<>(productFilter),
                    new ParameterizedTypeReference<List<Product>>() {
                    });
            return responseEntity.getBody();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Product> getSingerProductList(URI singerWebServiceUri, List<ProductFilter> productFilter) {
        try {
            ResponseEntity<List<Product>> responseEntity = restTemplate.exchange(singerWebServiceUri, HttpMethod.POST, new HttpEntity<>(productFilter),
                    new ParameterizedTypeReference<List<Product>>() {
                    });
            return responseEntity.getBody();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
