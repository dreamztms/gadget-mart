package com.gadgetmart.controller;

import com.gadgetmart.model.Order;
import com.gadgetmart.model.UserProfile;
import com.gadgetmart.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author thilinamullewidane
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/get-user-details/{userId}")
    public ResponseEntity<UserProfile> getUserDetails(@PathVariable String userId)  {
        return new ResponseEntity<>(profileService.getUserDetails(userId), HttpStatus.OK);
    }


    @PutMapping("/update-user-profile")
    public ResponseEntity<Integer> updateUserProfile(@RequestBody UserProfile userProfile) {
        return new ResponseEntity<>(profileService.updateUserProfile(userProfile), HttpStatus.OK);
    }

    @PostMapping("/register-user")
    public ResponseEntity<Integer> registerUser(@RequestBody UserProfile userProfile) {
        return new ResponseEntity<>(profileService.registerUser(userProfile), HttpStatus.OK);
    }

}
