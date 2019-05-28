package com.generation.app.panaderia.controllers;

import com.generation.app.panaderia.model.entity.Panes;
import com.generation.app.panaderia.model.service.IPanesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductosController {
    @Autowired
    private IPanesService panesService;
    @GetMapping("/categorias/{categoria}")
    public String categoriasPan(@PathVariable(value = "categoria") String categoria, Model model){
        model.addAttribute("pan",panesService.findByCategoriaPanes(categoria));
        return "categorias";
    }
    @GetMapping("/categorias/pasteles")
    public String categoriasPanEspecifico( Model model){
        List<String> categorias=new ArrayList<String>();
        categorias.add("temporada");
        categorias.add("panes");
        categorias.add("otros");
        model.addAttribute("pan",panesService.findByCategoriaPanesNotIn(categorias));
        return "categorias";
    }
    @GetMapping("/categorias")
    public String categorias(Model model){
        model.addAttribute("pan",panesService.findAll());
        return "categorias";
    }
    @GetMapping("/productos")
    public String categoriasEditar(Model model){
        model.addAttribute("pan",panesService.findAll());
        return "productos";
    }
    @GetMapping("/form")
    public String crear(Model model){
        Panes panes =new Panes();
        model.addAttribute("pan",panes);
        return "add_product";
    }
    @PostMapping("/form")
    public String guardar(Panes panes){
        panesService.save(panes);
        return "redirect:categorias";
    }
    @RequestMapping(value = "/form/{idPan}")
    public String editar(@PathVariable(value = "idPan") Integer idPan, Model model){
        Panes panes=null;
            panes =panesService.findOne(idPan);
        model.addAttribute("pan",panes);
        return "add_product";
    }
    @RequestMapping(value = "/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Integer id){
        if (id>0){
            panesService.delete(id);
        }
        return "redirect:/productos";
    }
}
