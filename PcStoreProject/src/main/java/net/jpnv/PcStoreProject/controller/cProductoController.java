package net.jpnv.PcStoreProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import net.jpnv.PcStoreProject.repository.ProductoRepo;
import net.jpnv.PcStoreProject.entities.cProducto; 

@Controller 
@RequestMapping("/PcStore")


public class cProductoController {
	
@Autowired 
ProductoRepo Prod; 


@RequestMapping("")
public String Index() {
	return "Index";
}

 
 @GetMapping("/add_producto")
 public String showSignUpForm(cProducto Producto) {
     return "add_producto";
 }
 
 @GetMapping("/list")
 public String showRecipes(Model model) {
	 model.addAttribute("product", Prod.findAll());
     return "list_productos";
 }
 
 @GetMapping("/Acerca")
 public String showSignUpForm() {
     return "Acerca";
 }
 
 @PreAuthorize("hasAuthority('admin')")
 @RequestMapping("/private")
 public String showPrivate(Model model) {
	 model.addAttribute("product", Prod.findAll());
     return "list_productos";
 }
  

 
}
