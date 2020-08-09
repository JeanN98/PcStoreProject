package net.jpnv.PcStoreProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.jpnv.PcStoreProject.entities.cProducto;
import net.jpnv.PcStoreProject.repository.UsuarioRepo;

@Controller
@RequestMapping("/PcStore/User")
public class cUsuarioController {
	@Autowired
	UsuarioRepo Usu;
	 
	 @PreAuthorize("hasAuthority('admin')")
	 @RequestMapping("/private")
	 public String showPrivate(Model model) {
		 model.addAttribute("productos", Usu.findAll());
	     return "list_tecnicos";
	 }
	  
	
}
