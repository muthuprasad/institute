/**
 * 
 */
package com.project.candid.Institute.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.project.candid.Institute.Bean.Student;
import com.project.candid.Institute.Service.StudentService;

/**
 * @author mmanickam
 *
 */
@RestController
@RequestMapping(value = { "/Student" })
public class StudentController {

	/**
	 * 
	 */
	public StudentController() {
		// TODO Auto-generated constructor stub
	}

	
	
		@Autowired
	StudentService studentService;
		
	    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Student> getUserById(@PathVariable("id") long id) {
	        System.out.println("Fetching User with id " + id);
		Student user = studentService.findById(id);
	        if (user == null) {
	            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<Student>(user, HttpStatus.OK);
	    }
	    
	@PostMapping(value = "/create", headers = "Accept=application/json")
	public ResponseEntity<Void> createUser(@RequestBody Student user, UriComponentsBuilder ucBuilder) {
		     System.out.println("Creating User "+user.getName());
		studentService.createStudent(user);
		     HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/Student/{id}").buildAndExpand(user.getId()).toUri());
		     return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		 }

	@GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	public ResponseEntity<List<Student>> getAllStudents() {

		List<Student> tasks = studentService.getUser();

		return new ResponseEntity<List<Student>>(tasks, HttpStatus.OK);

		// return tasks;

	}

	@PutMapping(value = "/update/{id}", headers = "Accept=application/json")
	public ResponseEntity<String> updateUser(@RequestBody Student currentUser, @PathVariable("id") long id) {

		Student s = studentService.update(currentUser, id);
		if (null != s)
		return new ResponseEntity<String>(HttpStatus.OK);
		else
			return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping(value = "/{id}", headers = "Accept=application/json")
	public ResponseEntity<?> deleteUser(@PathVariable("id") long id) {
		Student user = studentService.findById(id);
		if (user == null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		studentService.deleteUserById(id);
		return ResponseEntity.ok().build();
	}
	/*
	 * *
	 * 
	 * @PatchMapping(value="/{id}", headers="Accept=application/json") public
	 * ResponseEntity<User> updateUserPartially(@PathVariable("id") long
	 * id, @RequestBody User currentUser){ User user = studentService.findById(id);
	 * if(user ==null){ return new ResponseEntity<User>(HttpStatus.NOT_FOUND); }
	 * User usr = studentService.updatePartially(currentUser, id); return new
	 * ResponseEntity<User>(usr, HttpStatus.OK); } }
	 */

}
