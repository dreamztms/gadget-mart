package com.gadgetmart.service.impl;

import com.gadgetmart.model.UserProfile;
import com.gadgetmart.repository.ProfileRepository;
import com.gadgetmart.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author thilinamullewidane
 */
@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public UserProfile getUserDetails(String userId) {
        return profileRepository.getUserDetails(userId);
    }

    @Override
    public Integer updateUserProfile(UserProfile userProfile) {
        return profileRepository.updateUserProfile(userProfile);
    }

    @Override
    public Integer registerUser(UserProfile userProfile) {
        return profileRepository.registerUser(userProfile);
    }
}
