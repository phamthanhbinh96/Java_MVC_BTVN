/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import static com.model.MapStudent.mapStudent;
import com.model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author P.T.B
 */
public class StudentDAO {
    
    public List<Student> ViewAll(List<Student> mapValue){
        List<Student> listStd = new ArrayList<Student>();
        return listStd;
    }
    
    public void addNew(Student student) {

		mapStudent.put(student.getId(), student);
	}

    public void deleteStudent(int id) {
            mapStudent.remove(id);
    }

    public Student update(Student student) {
        return student;
    }

   public List<Student> searchByName (String name){
        List<Student> listStd = new ArrayList<Student>();

        for (Student std : mapStudent.values()) {
            if(std.getName().toLowerCase().contains(name.toLowerCase())) {
                listStd.add(std);
            }
        }

        return listStd;
		
    }  

   
    
    
    
}
