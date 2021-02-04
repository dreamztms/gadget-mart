package com.gadgetmart.repository;

import com.gadgetmart.model.UserProfile;

/**
 * @author thilinamullewidane
 */
public interface ProfileRepository {
    UserProfile getUserDetails(String userId);

    Integer updateUserProfile(UserProfile userProfile);

    Integer registerUser(UserProfile userProfile);
}

