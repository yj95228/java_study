package com.edu.service;

import java.util.ArrayList;

import com.edu.domain.Person;
import com.edu.exception.DuplicateSSNException;
import com.edu.exception.RecordNotFoundException;

//Template기능들..
public interface Manager {
	void getPersons();
	void addPerson(Person person)throws DuplicateSSNException;
	void deletePerson(int ssn)throws RecordNotFoundException;
	Person findPerson(int ssn);
	ArrayList<Person> findPerson(String addr);
	void updatePerson(String name,int age, String addr, String str,int k);
}
