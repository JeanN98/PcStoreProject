package net.jpnv.PcStoreProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;


import net.jpnv.PcStoreProject.repository.cUsuarioImpl;
@Controller 
@RequestMapping("/PcStore/User")
public class UsuarioControlador {


	@Autowired
	@Qualifier("Repository2")
	cUsuarioImpl User;
		
}//

