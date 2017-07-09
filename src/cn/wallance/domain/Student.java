package cn.wallance.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Student {
	private int id;
	private String name;
	private int c_id;
	
	public Student(){}

	public Student(int id, String name, int c_id) {
		super();
		this.id = id;
		this.name = name;
		this.c_id = c_id;
	}

    @GeneratedValue
    @Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	
	

}
