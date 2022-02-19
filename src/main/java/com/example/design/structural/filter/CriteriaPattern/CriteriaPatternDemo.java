package com.example.design.structural.filter.CriteriaPattern;

import com.example.design.structural.filter.CriteriaPattern.criteria.Criteria;
import com.example.design.structural.filter.CriteriaPattern.criteria.CriteriaFemale;
import com.example.design.structural.filter.CriteriaPattern.criteria.CriteriaMale;
import com.example.design.structural.filter.CriteriaPattern.criteria.CriteriaSingle;
import com.example.design.structural.filter.CriteriaPattern.domain.Person;
import com.example.design.structural.filter.CriteriaPattern.filters.AndCriteria;
import com.example.design.structural.filter.CriteriaPattern.filters.OrCriteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        Criteria singleAndMaleOrFemale = new AndCriteria(single, new OrCriteria(male, female));

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

        System.out.println("\nSingle And male Or Females: ");
        printPersons(singleAndMaleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
