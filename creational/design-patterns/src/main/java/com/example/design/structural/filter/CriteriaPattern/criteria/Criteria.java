package com.example.design.structural.filter.CriteriaPattern.criteria;

import com.example.design.structural.filter.CriteriaPattern.domain.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}