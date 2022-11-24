package br.edu.infnet.AppOrderProduct.model.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.ObjectMapper;
import br.edu.infnet.AppOrderProduct.DataFactory;
import br.edu.infnet.AppOrderProduct.clients.IAddressClient;
import br.edu.infnet.AppOrderProduct.clients.IAccountClient;
import br.edu.infnet.AppOrderProduct.model.domain.Account;
import br.edu.infnet.AppOrderProduct.model.domain.Address;
import br.edu.infnet.AppOrderProduct.model.domain.User;

@Service
public class AccountService {
	@Autowired
	IAddressClient addressClient;
	@Autowired
	IAccountClient clientApi;
	
	public void insertAcc(Account account) {
		clientApi.insert(account);
	}
	public void deleteAcc(Integer id) {
		clientApi.delete(id);
	}
	public List<Account> getAccList(User u, Model model){
		if(u.getIsAdmin()) {
			model.addAttribute("message","You're an admin, that's why you can see all accounts.");
			return (List<Account>) clientApi.getList();
		}else {
			return (List<Account>) clientApi.getList(u.getId());
		}
	}
	public List<Account> getAccList(User u){
		return (List<Account>) clientApi.getList(u.getId());
	}
	public Address getPostalCode(String postalCode) {
		Object obj = addressClient.getPostalCode(postalCode);
		ObjectMapper mapObject = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map <String,String> mapObj = mapObject.convertValue(obj, Map.class);
		Address address = DataFactory.createAddress(mapObj.get("logradouro"), null, mapObj.get("complemento"),mapObj.get("uf"), mapObj.get("localidade"), postalCode,"BRAZIL");
		System.out.println(address);
		return address;
	}	
}
