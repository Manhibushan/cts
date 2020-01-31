package controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Model.Cd;

@Controller
@RequestMapping("/cd")
public class Cdcontroller {
	@RequestMapping(method = RequestMethod.GET,path="/showForm" )
	public String showFormadd()
	
	{
	return "add-cd";	
	}
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("title") String title,@RequestParam("type") String type,@RequestParam("year")String year,Model model)
	{
		LocalDate date=LocalDate.now();
		Cd cd=new Cd(title,type,year,date);
		model.addAttribute("cd",cd );
		return "success";
	}
}
