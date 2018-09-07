/**
 * 
 */
package com.project.candid.Institute.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.candid.Institute.Bean.Student;
import com.project.candid.Institute.Repository.StudentRepository;

/**
 * @author mmanickam
 *
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	/**
	 * 
	 */
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.project.management.Institutes.Service.StudentService#createStudent(com.project.management.Institutes.Bean.Student)
	 */
	
	@Autowired
	StudentRepository studrepo;
	@Override
	public void createStudent(Student user) {
		// TODO Auto-generated method stub
		studrepo.save(user);

	}
	@Override
	public List<Student> getUser() {
		// TODO Auto-generated method stub
		return studrepo.findAll();
	}
	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		if (studrepo.findById(id).isPresent()) {
			return studrepo.findById(id).get();
		  
		}
		return null;
	}
	@Override
	public Student update(Student user, long l) {
		Student s = null;
		if (studrepo.findById(l).isPresent())
			s = studrepo.findById(l).get();
		if (null != s) {
			s.setMobileprimary(user.getMobileprimary());
			s.setName(user.getName());
			s.setEmail(user.getEmail());
			s.setMobilesecondary(user.getMobilesecondary());
		// TODO Auto-generated method stub
			return studrepo.save(s);
		}
		return null;
	}
	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		
		studrepo.deleteById(id);
		
	}


}
