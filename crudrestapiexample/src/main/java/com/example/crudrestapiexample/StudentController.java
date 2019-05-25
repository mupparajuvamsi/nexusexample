package com.example.crudrestapiexample;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	private static Logger logger = LoggerFactory.getLogger(StudentController.class);
	@Autowired
	StudentRepository studentRepository;

//method for saving employee details
	@RequestMapping(value = "/createStudent", method = RequestMethod.POST)
	public void createEmployee(@RequestBody Student student) {
		studentRepository.save(student);

	}

	// method for getting all employee details
	@RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
	public List<Student> getAllStudents() {
		logger.info("getAllStudents getAllStudents................"+studentRepository.findAll());
		return studentRepository.findAll();
	}

	/*
	 * @RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT) public
	 * void updateEmployee(@RequestBody Employee employee) {
	 * studentRepository.save(employee);
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/deleteEmployee", method = RequestMethod.DELETE)
	 * public void deleteEmployee(@RequestBody Employee employee) {
	 * studentRepository.delete(employee);
	 * 
	 * }
	 */
	@RequestMapping(value = "/deleteStudent", method = RequestMethod.DELETE)
	public void deleteStudent(@RequestParam String studentid) {
		//studentRepository.delete(studentid);
		//studentRepository.deleteStudentid(studentid);
		//Student deleted = studentRepository.findById(studentid);
		Student student=studentRepository.findByStudentid(studentid).get(0);
		studentRepository.delete(student);
	}
}
