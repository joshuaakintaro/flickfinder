package com.flickfinder.model;

/**
 * A person in the movie database.
 * Has an id, name, and DOB.
 * 
 * @TODO: Implement this class
 */
public class Person {

	private int id;
	private String name;
	private int birth;
	
	public Person(int id, String name, int birth) {
		this.setId(id);
		this.setName(name);
		this.setBirth(birth);
	}

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

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", date of birth=" + birth + "]";
	}
	// - Add your code here: use the MovieDAO.java as an example
	// - Check the ERD and database schema in the docs folder
	// (./docs/database_schema.md) to ensure each column in the People table
	// has an attribute in the model. (DELETE THIS COMMENT WHEN DONE)

}
