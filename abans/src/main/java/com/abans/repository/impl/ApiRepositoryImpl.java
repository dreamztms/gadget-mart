package com.abans.repository.impl;

import com.abans.model.Product;
import com.abans.model.ProductFilter;
import com.abans.model.ProductImage;
import com.abans.repository.ApiRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @author thilinamullewidane
 */

@Repository
public class ApiRepositoryImpl implements ApiRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<Product> getProductList(List<ProductFilter> productFilter) {
        StringBuilder getContactsQuery = new StringBuilder("select * from product");

        return namedParameterJdbcTemplate.query(
                getContactsQuery.toString(),
                Collections.emptyMap(),
                (rs, i) -> {
                    Product product = new Product();
                    product.setProductId(rs.getString("productId"));
                    product.setProductName(rs.getString("productName"));
                    product.setProductDescription(rs.getString("productDescription"));
                    product.setPrice(rs.getInt("price"));
                    product.setQty(rs.getInt("qty"));
                    product.setType(rs.getString("type"));
                    product.setProductImages(getProductList(rs.getString("productId")));



                    return product;
                });
    }

    private List<ProductImage> getProductList(String productId) {
        StringBuilder getContactsQuery = new StringBuilder("select * from product_images where product_id = :productId");

        return namedParameterJdbcTemplate.query(
                getContactsQuery.toString(),
                Collections.singletonMap("productId",productId),
                (rs, i) -> {
                    ProductImage productImage = new ProductImage();
                    productImage.setProductId(rs.getString("PRODUCT_ID"));
                    productImage.setImageId(rs.getInt("IMAGE_ID"));
                    productImage.setImageUrl(rs.getString("IMAGE_URL"));
                    return productImage;
                });
    }

}
