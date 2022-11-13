package br.edu.infnet.AppOrderProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppOrderProduct.model.domain.Software;
import br.edu.infnet.AppOrderProduct.model.service.SoftwareService;

@Controller
public class SoftwareController {
	
	@Autowired
	SoftwareService softwareService;
	@GetMapping(value="/software")
	public String softwareScreen() {
		return "software/register";
	}
	@PostMapping(value="/software/insert")
	public String insert(Software software) {
		softwareService.insertSoftware(software);
		return "redirect:/software/list";
	}
	@GetMapping(value="/software/list")
	public String softwareScreen(Model model) {
		model.addAttribute("softwares",softwareService.getSoftwareList());
		return "software/list";
	}
	@GetMapping(value="/software/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		softwareService.deleteSoftware(id);
		return "redirect:/software/list";
	}
}
