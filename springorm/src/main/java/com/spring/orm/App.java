package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
        StudentDao bean = (StudentDao) con.getBean("stDao");
       // inserting the value
//        Student s=new Student(2222,"arpit");
//        int i = bean.insert(s);
//        System.out.println("insert"+i);

        //  updating the value--->>>>
//        Student s=bean.getStudent(2222);
//        s.setName("jay");
//        bean.update(s);
        
        // get all student---->>>

        List<Student> students=bean.getAllStudents();
        for(Student s:students)
        {
            System.out.println(s);
        }
        
    }
}
