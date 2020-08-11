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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.jpnv.PcStoreProject.entities.cCarrito;
import net.jpnv.PcStoreProject.entities.cProducto;
//import net.jpnv.PcStoreProject.repository.cProductoImpl;
import net.jpnv.PcStoreProject.repository.CarritoRepo;


@Controller 
@RequestMapping("/PcStoreCar")
public class cCarritoController {



//	@Autowired 
	// cProductoImpl Prod; 
	@Autowired
	CarritoRepo carr;

	@RequestMapping("")
	public String Index() {
		return "Index";
	}
	
	 @GetMapping("/list")
	public String showCarrito(Model model) {
		 model.addAttribute("ProdInCar", carr.findAll());
	  return "Carrito";
	 }
	 
	 
	 @PreAuthorize("hasAuthority('admin')")
	 @GetMapping("/edit/{id}")
	 public String showUpdateForm(@PathVariable("1") Long id,cProducto prod, Model model) {
	     cCarrito producto = carr.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
	     producto.agregarProducto(prod);
	     model.addAttribute("ProdInCar", producto);
	     return "Carrito";
	 }
	 
	 @PreAuthorize("hasAuthority('admin')")
	 @PostMapping("/update/{id}")
	 public String updateRecipe(@PathVariable("id") Long id, cCarrito receta, BindingResult result, Model model, @RequestParam("file") MultipartFile file) {
	     if (result.hasErrors()) {
	          receta.setNumCarrito(id);
	          return "Carrito";
	     }     
	   
	     carr.save(receta);
	     return "redirect:/PcStoreCar/list";
	 }
	 
	
}
