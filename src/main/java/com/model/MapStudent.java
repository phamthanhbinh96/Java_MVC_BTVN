/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author P.T.B
 */
public class MapStudent {
	public static Map<Integer, Student> mapStudent = new HashMap<Integer, Student>();
        public static List<Student> listStudents = new ArrayList<Student>();

	public static ArrayList<Student> getStd() {
		ArrayList<Student> std = new ArrayList<Student>(mapStudent.values());
		return std;
	}
}
