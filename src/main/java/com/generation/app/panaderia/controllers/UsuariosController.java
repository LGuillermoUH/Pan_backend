package com.generation.app.panaderia.controllers;

import com.generation.app.panaderia.model.entity.Usuarios;
import com.generation.app.panaderia.model.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class UsuariosController {
    @Autowired
    private IUsuarioService usuarioService;
    @GetMapping("/usuarios")
    public String mostrarProveedores(Model model){
        model.addAttribute("usuario",usuarioService.findAll());
        return "usuarios";
    }
    @GetMapping("/formUsuarios")
    public String crear(Model model){
        Usuarios usuarios =new Usuarios();
        model.addAttribute("usuarios",usuarios);
        return "formUsuarios";
    }
    @PostMapping("/formUsuarios")
    public String guardar(Usuarios usuario){
        usuarioService.save(usuario);
        return "redirect:usuarios";
    }
    @RequestMapping(value = "/formUsuarios/{idUsuario}")
    public String editar(@PathVariable(value = "idUsuario") Integer idUsuario, Model model){
        Usuarios usuarios=null;
        usuarios =usuarioService.findOne(idUsuario);
        model.addAttribute("usuarios",usuarios);
        return "formUsuarios";
    }
    @RequestMapping(value = "/eliminarUsuario/{idUsuario}")
    public String eliminar(@PathVariable(value = "idUsuario") Integer idUsuario){
        if (idUsuario>0){
            usuarioService.delete(idUsuario);
        }
        return "redirect:/usuarios";
    }
}
