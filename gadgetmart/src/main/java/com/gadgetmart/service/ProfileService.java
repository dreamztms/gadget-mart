package com.gadgetmart.service;

import com.gadgetmart.model.UserProfile;

/**
 * @author thilinamullewidane
 */
public interface ProfileService {
    UserProfile getUserDetails(String userId);

    Integer updateUserProfile(UserProfile userProfile);

    Integer registerUser(UserProfile userProfile);
}
