package com.codingdojo.web.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingdojo.mvc.models.Contact;
import com.codingdojo.mvc.models.Student;
import com.codingdojo.mvc.services.ContactService;
import com.codingdojo.mvc.services.StudentService;



@Controller
public class mainController {
	private final StudentService studentService;
	private final ContactService contactService;
	public mainController(StudentService personService, ContactService contactService) {
		this.studentService = personService;
		this.contactService = contactService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/student/new";
	}
	@RequestMapping("/student/new")
    public String newBook(@ModelAttribute("student") Student student) {
        return "/views/newStudent.jsp";
    }
	@RequestMapping(value = "/create/student", method = RequestMethod.POST)
	public String createStudent(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "/views/newStudent.jsp";
		} else {
			studentService.createStudent(student);
			return "redirect:/contact/new";
		}
	}
	@RequestMapping("/contact/new")
	public String newContact(@ModelAttribute("contact")Contact contact, Model model) {
		List<Student> listStudent = studentService.allStudent();
		model.addAttribute("student", listStudent);
		return "/views/newContact.jsp";
	}
	@RequestMapping(value="/contact/create", method=RequestMethod.POST)
	public String createContact(@Valid @ModelAttribute("contact")Contact contact, BindingResult result) {
		if(result.hasErrors()) {
			return "redirect:/contact/new";
		}else {
			contactService.createContact(contact);
			return "redirect:/";
		}
		
	}
	
	@RequestMapping("/student/{id}")
	public String showProfile(@PathVariable("id") Long id, Model model) {
		Student findStudent = studentService.findStudent(id);
		Contact findContact = contactService.findContact(id);
		model.addAttribute("student", findStudent);
		model.addAttribute("contact", findContact);
		return "/views/show.jsp";
		
	}
	
}