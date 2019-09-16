/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author P.T.B
 */
public class Student {
    int id;
    String name;    
    int yearOfBirth;
    String gender;
    Date admissionDate;
    String dateFormat;
    
    static String format = "dd/MM/yyyy";
    static SimpleDateFormat convertDate = new SimpleDateFormat(format);
        
    public Student(int id, String name, int yearOfBirth, Date admissionDate) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.admissionDate = admissionDate;
        dateFormat = convertDate.format(admissionDate);
        
    }

    public Student(int id, String name, int yearOfBirth, String gender, String admissionDate) {
       this.id = id;
       this.name = name;
       this.yearOfBirth = yearOfBirth;
       try {
            this.admissionDate = convertDate.parse(admissionDate);
            dateFormat = admissionDate;
        } catch (ParseException e) {
            this.admissionDate = new Date();
        }
        
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", yearOfBirth=" + yearOfBirth + ", gender=" + gender + ", admissionDate=" + admissionDate + ", dateFormat=" + dateFormat + '}';
    }
    
    
    
    
}
