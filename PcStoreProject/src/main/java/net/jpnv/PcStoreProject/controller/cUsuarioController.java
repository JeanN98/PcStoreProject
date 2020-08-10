package net.jpnv.PcStoreProject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.jpnv.PcStoreProject.repository.UsuarioRepo;
import net.jpnv.PcStoreProject.entities.cProducto;


@Controller
@RequestMapping("/PcStore/User")
public class cUsuarioController {
	@Autowired
	UsuarioRepo Usu;
	 
	 @PreAuthorize("hasAuthority('admin')")
	 @RequestMapping("/private")
	 public String showPrivate(Model model) {
		 model.addAttribute("tecnico", Usu.findAll());
	     return "list_tecnicos";
	 }
	  
	
}
