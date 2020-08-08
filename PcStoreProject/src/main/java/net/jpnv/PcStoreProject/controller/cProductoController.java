package net.jpnv.PcStoreProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import net.jpnv.PcStoreProject.repository.cProductoImpl;

@Controller 
@RequestMapping("/PcStore")
public class cProductoController {
@Autowired 
 cProductoImpl Prod; 

@RequestMapping("")
public String Index() {
	return "Index";
}

 @RequestMapping("/login")
 public String login() {
	return "login";
}
 
 @PreAuthorize("hasAuthority('admin')")
 @RequestMapping("/private")
 public String showPrivate(Model model) {
	 model.addAttribute("productos", Prod.findAll());
     return "list_productos";
 }
 
 
}
