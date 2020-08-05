package net.jpnv.PcStoreProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

import net.jpnv.PcStoreProject.repository.cProductoImpl;

@Controller 
@RequestMapping("/PcStore")
public class ProductoControlador {
	@Autowired 
	@Qualifier("Repository1")
	cProductoImpl Prod; 
}
//