package com.gadgetmart.connector;

import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;

import java.net.URI;
import java.util.List;

/**
 * @author thilinamullewidane
 */

public interface WebServiceConnector {
    List<Product> getSoftlogicProductList(URI softlogicWebServiceUri , List<ProductFilter> productFilter);

    List<Product> getAbansProductList(URI abansWebServiceUri, List<ProductFilter> productFilter);

    List<Product> getSingerProductList(URI singerWebServiceUri, List<ProductFilter> productFilter);
}
