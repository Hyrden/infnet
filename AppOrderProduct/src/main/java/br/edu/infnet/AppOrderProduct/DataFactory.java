package br.edu.infnet.AppOrderProduct;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.model.domain.Game;
import br.edu.infnet.AppOrderProduct.model.domain.Order;
import br.edu.infnet.AppOrderProduct.model.domain.Peripheral;
import br.edu.infnet.AppOrderProduct.model.domain.Software;

/* Classe Responsável por auxiliar a criação de massa de testes */
public class DataFactory {
	
	public static Game createGame(Double value,String name, String code, String description, String category,
			String company, Boolean isReleased, Boolean preOrder, LocalDate releaseDate) {
		Game game = new Game();
		game.setValue(value);
		game.setName(name);
		game.setCode(code);
		game.setDescription(description);
		game.setCategory(category);
		game.setCompany(company);
		game.setReleased(isReleased);
		game.setPreOrder(preOrder);
		game.setReleaseDate(releaseDate);
		return game;
	}
	public static Software createSoftware(Double value,String name, String code, String description, String category,
			String company,String license, Integer maxPCAllowed, Integer currentInstallations) {
		Software software = new Software();
		software.setValue(value);
		software.setName(name);
		software.setCode(code);
		software.setDescription(description);
		software.setCategory(category);
		software.setCompany(company);
		software.setLicense(license);
		software.setMaxPCAllowed(maxPCAllowed);
		software.setCurrentInstallations(currentInstallations);
		return software;
	}
	public static Peripheral createPeripheral(Double value,String name, String code, String description, String category,
			String company,String firmware, Integer warrant, Float weight) {
		Peripheral peripheral = new Peripheral();
		peripheral.setValue(value);
		peripheral.setName(name);
		peripheral.setCode(code);
		peripheral.setDescription(description);
		peripheral.setCategory(category);
		peripheral.setCompany(company);
		peripheral.setFirmware(firmware);
		peripheral.setWarrant(warrant);
		peripheral.setWeight(weight);
		return peripheral;
	}
	public static Account createAccount(LocalDate birthday,String name, String documentNumber, String email, String addressStreet,
			String addressNumber, String addressComplement, String addressState, String addressCity, String addressPostalCode, String addressCountry) {
		Account account = new Account();
		account.setName(name);
		account.setDocumentNumber(documentNumber);
		account.setEmail(email);
		account.setAddressCity(addressCity);
		account.setAddressComplement(addressComplement);
		account.setAddressCountry(addressCountry);
		account.setAddressNumber(addressNumber);
		account.setAddressPostalCode(addressPostalCode);
		account.setAddressState(addressState);
		account.setAddressStreet(addressStreet);
		account.setBirthday(birthday);
		return account;
	}
	public static Order createOrder(Integer orderNumber, LocalDateTime createdDate, String paymentMethod){
		Order order = new Order();
		order.setOrderNumber(orderNumber);
		order.setCreatedDate(createdDate);
		order.setPaymentMethod(paymentMethod);
		return order;
	}
}
