package br.edu.infnet.AppOrderProduct.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;

@Controller
public class PeripheralController {
private static Map<Integer,Peripheral> mpPeripheral = new HashMap<Integer,Peripheral>();
	
	public static void insertPeripheral(Peripheral peripheral) {
		mpPeripheral.put(peripheral.getId(), peripheral);
	}
	public static void deletePeripheral(Integer id) {
		mpPeripheral.remove(id);
	}
	public static Collection<Peripheral> getPeripheralList(){
		return mpPeripheral.values();
	}
	@GetMapping(value="/peripheral/list")
	public String peripheralScreen(Model model) {
		model.addAttribute("peripherals",getPeripheralList());
		return "peripheral/list";
	}
	@GetMapping(value="/peripheral/{id}/delete")
	public String deletion(@PathVariable Integer id) {
		deletePeripheral(id);
		return "redirect:/peripheral/list";
	}
}
