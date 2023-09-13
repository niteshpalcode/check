package crudOperation.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import crudOperation.entity.Student;
import crudOperation.service.StudentService;

@Controller



public class CrudController {

//	@Autowired
	private StudentService studentService;

	@RequestMapping("/home")
	public String check() {
		System.out.println("rnning");
		return "home";
	}

	@PostMapping("/addStudent")
	public String addStud(@RequestParam String firstName, String lastName, String gender, String email,
			String dateOfBirth, Model model, Student student) throws ParseException {
		System.out.println("post hiiiiiiiiiiii");

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd");
		Date date=formatter.parse(dateOfBirth);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setEmail(email);
		student.setDateOfBirth(date);
		student.setGender(gender);
		
		
		studentService.addStudent(student);
		
		System.out.println("post");
		return "redirect:/studentList";
	}
	
	@GetMapping("/studentList")
	public String allStudentList(Model model) {
		System.out.println("hiiiiiiiiiiiiiii");
		List<Student> studentList= studentService.viewAll();
		model.addAttribute("student", studentList);
		System.out.println("get");
		return "listall";
		
		
		
	}

//	@RequestMapping("/main")
//	public String Test() {
//		return "main";
//	}
}
