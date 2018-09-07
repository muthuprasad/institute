/**
 * 
 */
package com.project.candid.Institute.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.candid.Institute.Bean.Student;

/**
 * @author mmanickam
 *
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
