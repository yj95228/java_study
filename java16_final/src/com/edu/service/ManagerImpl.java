package com.edu.service;

import java.util.ArrayList;

import com.edu.domain.Employee;
import com.edu.domain.Person;
import com.edu.domain.Student;
import com.edu.domain.Teacher;
import com.edu.exception.DuplicateSSNException;
import com.edu.exception.RecordNotFoundException;

public class ManagerImpl implements Manager{
	
	private ArrayList<Person> list;
	
	public ManagerImpl(int size){
		list = new ArrayList<>();
	}
	public void getPersons(){
		for(Person p : list) {
			System.out.println(p);
		}
	}	
	
	public void addPerson(Person person)throws DuplicateSSNException{		
		//추가하려는 사람이 없을때만 추가되도록 작성
		for(Person p : list) {
			if(p.getSsn() == person.getSsn()) {
				throw new DuplicateSSNException("중복된 SSN이 존재하여 추가 불가합니다");
			}
		}
		list.add(person);
	}//
	
	public void deletePerson(int ssn)throws RecordNotFoundException{
		for(Person p: list) {
			if(p.getSsn() == ssn) {
				list.remove(p);
				return;
			}
		}
		throw new RecordNotFoundException("존재하지 않는 SSN이므로 삭제 불가합니다");
	}
	public Person findPerson(int ssn){
		Person person = null;
		for(Person p : list) {
			if(ssn==p.getSsn()) person = p;
		}		
		return person;
	}//
	
	public ArrayList<Person> findPerson(String addr){
		ArrayList<Person> temp = new ArrayList<>();
		for(Person p : list) {
			if(p.getAddress().equals(addr)) temp.add(p);			
		}
		return temp;
	}
	public void updatePerson(String name,int age, String addr, String str,int k){	
		
	//특정한 위치에 있는 사람의 정보를 수정함
	//메소드의 인자값을 잘 활용해서 모든 객체의 정보가 수정될수 있도록 로직을 작성
		Person person = list.get(k);
		person.setName(name);
		person.setAge(age);
		person.setAddress(addr);
		if(person instanceof Student) {
			((Student) person).setStuId(str);
		}else if(person instanceof Employee) {
			((Employee) person).setDept(str);
		}else if(person instanceof Teacher) {
			((Teacher) person).setSubject(str);
		}
	}
}




