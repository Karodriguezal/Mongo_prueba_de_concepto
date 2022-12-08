package com.grupo4.proyecto_facturacion.controller;

import com.grupo4.proyecto_facturacion.entities.UsuarioEntitie;
import com.grupo4.proyecto_facturacion.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public List<UsuarioEntitie> getAll(){
        return usuarioService.getAll();
    }

    @GetMapping("/{usuarioId}")
    public UsuarioEntitie getgetUsuarioById(@PathVariable Integer usuarioId){
        return usuarioService.getUsuarioById(usuarioId).get();
    }

    @PostMapping("/save")
    public UsuarioEntitie save(@RequestBody UsuarioEntitie usuarioEntitie){
        return usuarioService.save(usuarioEntitie);
    }

    @PutMapping("/update")
    public UsuarioEntitie update(@RequestBody UsuarioEntitie usuarioEntitie){
        return usuarioService.update(usuarioEntitie);
    }

    @DeleteMapping("/{usuarioId}")
    public boolean delete(@PathVariable Integer usuarioId){
        return usuarioService.delete(usuarioId);
    }

}
