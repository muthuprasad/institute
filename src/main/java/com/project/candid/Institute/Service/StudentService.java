/**
 * 
 */
package com.project.candid.Institute.Service;

import java.util.List;

import com.project.candid.Institute.Bean.Student;

/**
 * @author mmanickam
 *
 */
public interface StudentService {

	
		public void createStudent(Student user);
		public List<Student> getUser();
		public Student findById(long id);
		public Student update(Student user, long l);
		public void deleteUserById(long id);
	//	public User updatePartially(User user, long id);
	}

