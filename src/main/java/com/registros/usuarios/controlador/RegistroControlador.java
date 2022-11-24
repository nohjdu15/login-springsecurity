package com.registros.usuarios.controlador;

import com.registros.usuarios.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;


    @GetMapping("/login")
    public String IniciarSesion(){
        return "login";
    }
    @GetMapping("/")
    public String verpaginadeinicio(Model modelo){
        modelo.addAttribute("usuarios", usuarioServicio.listarUsuarios());
        return "index";
    }



}
