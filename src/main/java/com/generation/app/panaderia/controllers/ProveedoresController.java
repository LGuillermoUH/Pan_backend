package com.generation.app.panaderia.controllers;

import com.generation.app.panaderia.model.entity.Proveedores;
import com.generation.app.panaderia.model.service.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class ProveedoresController {
    @Autowired
    private IProveedorService proveedorService;
    @GetMapping("/proveedores")
    public String mostrarProveedores(Model model){
        model.addAttribute("proveedores",proveedorService.findAll());
        return "proveedores";
    }
    @GetMapping("/formProveedores")
    public String crear(Model model){
        Proveedores proveedores =new Proveedores();
        model.addAttribute("proveedores",proveedores);
        return "formProveedores";
    }
    @PostMapping("/formProveedores")
    public String guardar(Proveedores proveedores){
        proveedorService.save(proveedores);
        return "redirect:proveedores";
    }
    @RequestMapping(value = "/formProveedores/{idProveedor}")
    public String editar(@PathVariable(value = "idProveedor") Integer idProveedor, Model model){
        Proveedores proveedores=null;
        proveedores =proveedorService.findOne(idProveedor);
        model.addAttribute("proveedores",proveedores);
        return "formProveedores";
    }
    @RequestMapping(value = "/eliminarProveedores/{idProveedor}")
    public String eliminar(@PathVariable(value = "idProveedor") Integer idProveedor){
        if (idProveedor>0){
            proveedorService.delete(idProveedor);
        }
        return "redirect:/proveedores";
    }
}
