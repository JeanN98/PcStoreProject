package net.jpnv.PcStoreProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.jpnv.PcStoreProject.repository.cUsuarioImpl;

@Controller
@RequestMapping("/PcStore/User")
public class cUsuarioController {
	@Autowired
	cUsuarioImpl Usu;
	
	
}
