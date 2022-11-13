package br.edu.infnet.AppOrderProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;
import br.edu.infnet.AppOrderProduct.model.service.PeripheralService;

@Controller
public class PeripheralController {
	@Autowired
	PeripheralService peripheralService;
	@GetMapping(value="/peripheral")
	public String peripheralScreen() {
		return "peripheral/register";
	}
	@PostMapping(value="/peripheral/insert")
	public String insert(Peripheral peripheral) {
		peripheralService.insertPeripheral(peripheral);
		return "redirect:/peripheral/list";
	}
	@GetMapping(value="/peripheral/list")
	public String peripheralScreen(Model model) {
		model.addAttribute("peripherals",peripheralService.getPeripheralList());
		return "peripheral/list";
	}
	@GetMapping(value="/peripheral/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		peripheralService.deletePeripheral(id);
		return "redirect:/peripheral/list";
	}
}
