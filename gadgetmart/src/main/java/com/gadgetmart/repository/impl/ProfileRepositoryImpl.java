package com.gadgetmart.repository.impl;

import com.gadgetmart.model.UserProfile;
import com.gadgetmart.repository.ProfileRepository;
import com.gadgetmart.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author thilinamullewidane
 */
@Repository
public class ProfileRepositoryImpl implements ProfileRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public UserProfile getUserDetails(String userId) {
        return null;
    }

    @Override
    public Integer updateUserProfile(UserProfile userProfile) {
        return null;
    }

    @Override
    public Integer registerUser(UserProfile userProfile) {
        return null;
    }
}
