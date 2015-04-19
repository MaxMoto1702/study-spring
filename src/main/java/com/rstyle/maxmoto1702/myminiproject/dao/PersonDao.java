package com.rstyle.maxmoto1702.myminiproject.dao;

import com.rstyle.maxmoto1702.myminiproject.domain.Person;

/**
 * Created by m on 12.04.2015.
 */
public interface PersonDao {

    void insertPerson(Person person);

    Person getPersonById(int id);

    Person getPersonByName(String firstName, String lastName);

    void updatePerson(Person person);

    void deletePerson(Person person);

    void setDataSource(org.springframework.jdbc.datasource.DriverManagerDataSource dataSource);
}
