package net.jpnv.PcStoreProject.controller;


import org.springframework.stereotype.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.jpnv.PcStoreProject.repository.UsuarioRepo;

import net.jpnv.PcStoreProject.entities.cProducto;
import net.jpnv.PcStoreProject.entities.cUsuario;


@Controller
@RequestMapping("/PcStore/User")
public class cUsuarioController {
	@Autowired
	UsuarioRepo Usu;
	
	
	
	
	@RequestMapping("")
	public String Index() {
		return "Index";
	}
	
	
	 @GetMapping("/add_tech")
	 public String showSignUpForm(cUsuario tecnico) {
	     return "add_tech";
	 }
	
	@GetMapping("/list")
	 public String showProducts(Model model) {
		 model.addAttribute("tecnico", Usu.findAll());
	     return "list_tecnicos";
	 }
	 
	 @PreAuthorize("hasAuthority('admin')")
	 @RequestMapping("/private")
	 public String showPrivate(Model model) {
		 model.addAttribute("tecnico", Usu.findAll());
	     return "list_tecnicos";
	 }
	  
	 
	 @PreAuthorize("hasAuthority('admin')")
	 @PostMapping("/add")
	 public String addRecipe(cUsuario tecnico, BindingResult result, Model model, @RequestParam("file") MultipartFile file) {
	     if (result.hasErrors()) {
	        return "add_tech";
	     }
	     
	     Usu.save(tecnico);   
	     return "redirect:list";
	 }
	
}
