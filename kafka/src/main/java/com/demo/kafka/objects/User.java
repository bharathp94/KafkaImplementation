/**
 * @author Bharath Prakash
 *
 */
package com.demo.kafka.objects;

public class User {

	private String name;
	private int age;
	
	public User() {
	}

	public User(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "{\"name\" : \"" + name + "\", \"age\" : " + age + "}";
	}

}
