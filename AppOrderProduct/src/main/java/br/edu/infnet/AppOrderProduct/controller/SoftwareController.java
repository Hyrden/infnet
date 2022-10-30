package br.edu.infnet.AppOrderProduct.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppOrderProduct.model.domain.Software;

@Controller
public class SoftwareController {
private static Map<Integer,Software> mpSoftware = new HashMap<Integer,Software>();
	
	public static void insertSoftware(Software software) {
		mpSoftware.put(software.getId(), software);
	}
	public static void deleteSoftware(Integer id) {
		mpSoftware.remove(id);
	}
	public static Collection<Software> getSoftwareList(){
		return mpSoftware.values();
	}
	@GetMapping(value="/software/list")
	public String softwareScreen(Model model) {
		model.addAttribute("softwares",getSoftwareList());
		return "software/list";
	}
	@GetMapping(value="/software/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		deleteSoftware(id);
		return "redirect:/software/list";
	}
}
