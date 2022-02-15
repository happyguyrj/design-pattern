package com.example.design.behavioural.iterator.socialMediaIterator.social_networks;

import com.example.design.behavioural.iterator.socialMediaIterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}