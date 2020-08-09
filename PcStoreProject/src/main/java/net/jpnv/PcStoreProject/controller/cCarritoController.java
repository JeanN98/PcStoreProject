package net.jpnv.PcStoreProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//import net.jpnv.PcStoreProject.repository.cProductoImpl;
import net.jpnv.PcStoreProject.repository.CarritoRepo;

@Controller 
@RequestMapping("/PcStorecar")
public class cCarritoController {



//	@Autowired 
	// cProductoImpl Prod; 
	@Autowired
	CarritoRepo carr;

	@RequestMapping("")
	public String Index() {
		return "Index";
	}
	
	 @GetMapping("/Carrito")
	public String showCarrito(Model model) {
		 model.addAttribute("ProdInCar", carr.findAll());
	  return "Carrito";
	 }
	
}
