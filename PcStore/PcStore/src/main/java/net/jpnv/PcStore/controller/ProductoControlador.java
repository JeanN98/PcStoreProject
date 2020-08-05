package net.jpnv.PcStore.controller;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;

import net.jpnv.PcStore.repository.cProductoImpl;

@Controller 
@RequestMapping("/PcStore")
public class ProductoControlador {
//text
	@Autowired 
	@Qualifier("Repository1")
	cProductoImpl Prod; 
}
