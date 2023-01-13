package com.spring.orm.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {
	 @Id
	    @Column(name="Student_Id")
	    private int id;
	    @Column(name="Student_Name")
	    private String name;
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
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}
	    
}
