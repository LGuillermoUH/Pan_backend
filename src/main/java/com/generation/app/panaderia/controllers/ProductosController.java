package com.generation.app.panaderia.controllers;

import com.generation.app.panaderia.model.entity.Panes;
import com.generation.app.panaderia.model.service.IPanesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


public class ProductosController {
    @Autowired
    private IPanesService panesService;
    @GetMapping("/categorias")
    public String mostrarPan(Model model){
        model.addAttribute("pan",panesService.findAll());
        return "categorias";
    }
    @GetMapping("/form")
    public String crear(Model model){
        Panes panes =new Panes();
        model.addAttribute("pan",panes);
        return "form";
    }
    @PostMapping("/form")
    public String guardar(Panes panes){
        panesService.save(panes);
        return "redirect:categorias";
    }
    @RequestMapping(value = "/form/{id}")
    public String editar(@PathVariable(value = "id") Integer id, Model model){
        Panes panes=null;
        if(id>0){
            panes =panesService.findOne(id);
        }else{
            return "redirect:/categorias";
        }
        model.addAttribute(panes);
        return "form";
    }
    @RequestMapping(value = "/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Integer id){
        if (id>0){
            panesService.delete(id);
        }
        return "redirect:/listar";
    }
}
