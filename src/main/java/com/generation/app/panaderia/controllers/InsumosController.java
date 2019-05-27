package com.generation.app.panaderia.controllers;

import com.generation.app.panaderia.model.entity.Insumos;
import com.generation.app.panaderia.model.service.IInsumosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class InsumosController {
    @Autowired
    private IInsumosService insumosService;
    @GetMapping("/insumos")
    public String mostrarProveedores(Model model){
        model.addAttribute("insumos",insumosService.findAll());
        return "insumos";
    }
    @GetMapping("/formInsumos")
    public String crear(Model model){
        Insumos insumos =new Insumos();
        model.addAttribute("insumos",insumos);
        return "formInsumos";
    }
    @PostMapping("/formInsumos")
    public String guardar(Insumos insumos){
        insumosService.save(insumos);
        return "redirect:insumos";
    }
    @RequestMapping(value = "/formInsumos/{idInsumos}")
    public String editar(@PathVariable(value = "idInsumos") Integer idInsumos, Model model){
        Insumos insumos=null;
        insumos =insumosService.findOne(idInsumos);
        model.addAttribute("insumos",insumos);
        return "formInsumos";
    }
    @RequestMapping(value = "/eliminarInsumos/{idInsumos}")
    public String eliminar(@PathVariable(value = "idInsumos") Integer idInsumos){
        if (idInsumos>0){
            insumosService.delete(idInsumos);
        }
        return "redirect:/insumos";
    }
}
