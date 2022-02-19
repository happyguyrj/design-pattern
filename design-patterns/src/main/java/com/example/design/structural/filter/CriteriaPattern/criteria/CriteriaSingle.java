package com.example.design.structural.filter.CriteriaPattern.criteria;

import com.example.design.structural.filter.CriteriaPattern.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}