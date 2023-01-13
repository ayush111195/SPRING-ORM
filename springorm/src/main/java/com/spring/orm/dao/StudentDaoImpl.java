package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entites.Student;

public class StudentDaoImpl implements StudentDao {
	 private HibernateTemplate hTemplate;
	  
	   
	  
	    @Transactional
	    public int insert(Student s) {
	        Integer i = (Integer) this.hTemplate.save(s);
			return i;
	    }
	  
	    @Transactional
	    public void delete(int id) {
	        Student s=hTemplate.get(Student.class,id);
	        hTemplate.delete(s);
	    }
	  
	    @Transactional
	    public void delete(Student s) {
	        hTemplate.delete(s);
	    }
	  
	    @Transactional
	    public void update(Student s) {
	        hTemplate.update(s);
	    }
	  
	    public Student getStudent(int id) {
	        return hTemplate.get(Student.class,id);
	    }
	  
	    public List<Student> getAllStudents() {
	        return hTemplate.loadAll(Student.class);
	    }

		public HibernateTemplate gethTemplate() {
			return hTemplate;
		}

		public void sethTemplate(HibernateTemplate hTemplate) {
			this.hTemplate = hTemplate;
		}
	    
	}


