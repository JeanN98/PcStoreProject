package net.jpnv.PcStoreProject.controller;

import org.springframework.stereotype.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.jpnv.PcStoreProject.repository.ProductoRepo;

import net.jpnv.PcStoreProject.entities.cProducto; 

@Controller 
@RequestMapping("/PcStore")


public class cProductoController {
	
@Autowired 
private ProductoRepo Prod; 


@RequestMapping("")
public String Index() {
	return "Index";
}

 
 @GetMapping("/add_producto")
 public String showSignUpForm(cProducto producto) {
     return "add_producto";
 }
 
@GetMapping("/list")
 public String showProducts(Model model) {
	 model.addAttribute("products", Prod.findAll());
     return "list_productos";
 }

@GetMapping("/catalogo")
public String showCatalogo(Model model) {
	 model.addAttribute("products", Prod.findAll());
    return "catalogo";
}
 
 @GetMapping("/Acerca")
 public String showSignUpForm() {
     return "Acerca";
 }
 
 @PreAuthorize("hasAuthority('admin')")
 @RequestMapping("/private")
 public String showPrivate(Model model) {
	 model.addAttribute("products", Prod.findAll());
     return "list_productos";
 }
 
 
 
 @PreAuthorize("hasAuthority('admin')")
 @PostMapping("/add")
 public String addProduct(cProducto cproducto, BindingResult result, Model model) {
     if (result.hasErrors()) {
        return "add_producto";
     }    
     Prod.save(cproducto);   
     return "redirect:list";
 }
 
 @PreAuthorize("hasAuthority('admin')")
 @GetMapping("/edit/{id}")
 public String showUpdateForm(@PathVariable("id") Long id, Model model) {
     cProducto producto = Prod.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
     model.addAttribute("product", producto);
     return "update_producto";
 }
  
 
 @PreAuthorize("hasAuthority('admin')")
 @PostMapping("/update/{id}")
 public String updateRecipe(@PathVariable("id") Long id, cProducto producto, BindingResult result, Model model) {
     if (result.hasErrors()) {
          producto.setId(id);
          return "update_producto";
     }
     Prod.save(producto);
     return "redirect:/PcStore/list";
 }
 
 
 @PreAuthorize("hasAuthority('admin')")
 @GetMapping("/delete/{id}")
 public String deleteRecipe(@PathVariable("id") Long id, Model model) {
     cProducto producto = Prod.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid recipe Id:" + id));
     Prod.delete(producto);	     
     model.addAttribute("products", Prod.findAll());
     return "list_productos";
 }

 
}
