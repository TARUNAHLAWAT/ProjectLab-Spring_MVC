package com.greatlearning.Studentmanagment.service;

import org.springframework.stereotype.Service;
import java.util.*;
import com.greatlearning.Studentmanagment.entity.*;

@Service
public interface StudentService {
	
	
	public List<Student> findAll();
	public Student findById(int id);
	public void save(Student theStudent);
	public void deleteById(int theId);

}
