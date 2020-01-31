package com.controller;

import com.controller.*;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	//@InitBinder
	//public void initBinder(WebDataBinder dataBinder)
	//{
		//StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
	//}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid@ModelAttribute("student") Student theStudent,BindingResult theresult) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
		if(theresult.hasErrors())
		{
			return "student-form";
		}
		
		return "student-confirmation";
	}
	
}