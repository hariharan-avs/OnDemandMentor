package com.spb.art;

public class Course {
	
	long id;
	String name;
	String author;
	String mentors;
	String Details;
	String PreRequisites;
	
	public Course(long id, String name, String author, String mentors, String details, String preRequisites) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.mentors = mentors;
		Details = details;
		PreRequisites = preRequisites;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + ", mentors=" + mentors + ", Details="
				+ Details + ", PreRequisites=" + PreRequisites + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getAuthor()=" + getAuthor() + ", getMentors()=" + getMentors() + ", getDetails()=" + getDetails()
				+ ", getPreRequisites()=" + getPreRequisites() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMentors() {
		return mentors;
	}

	public void setMentors(String mentors) {
		this.mentors = mentors;
	}

	public String getDetails() {
		return Details;
	}

	public void setDetails(String details) {
		Details = details;
	}

	public String getPreRequisites() {
		return PreRequisites;
	}

	public void setPreRequisites(String preRequisites) {
		PreRequisites = preRequisites;
	}
	
}
