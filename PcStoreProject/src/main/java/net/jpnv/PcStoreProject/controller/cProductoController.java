package net.jpnv.PcStoreProject.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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

 @RequestMapping("/login")
 public String login() {
	return "login";
}
 
 @GetMapping("/add_producto")
 public String showSignUpForm(cProducto Producto) {
     return "add_producto";
 }

 
 @PreAuthorize("hasAuthority('admin')")
 @RequestMapping("/private")
 public String showPrivate(Model model) {
	 model.addAttribute("productos", Prod.findAll());
     return "list_productos";
 }
  
}