package com.example.design.behavioural.iterator.socialMediaIterator.iterators;

import com.example.design.behavioural.iterator.socialMediaIterator.domain.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
