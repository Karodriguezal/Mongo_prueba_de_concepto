package com.grupo4.proyecto_facturacion.repository;

import com.grupo4.proyecto_facturacion.entities.UsuarioEntitie;
import com.grupo4.proyecto_facturacion.repository.crudrepository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsurioRepository {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioEntitie> getAll() {
        return (List<UsuarioEntitie>) usuarioRepository.findAll();
    }

    public UsuarioEntitie save(UsuarioEntitie usuarioEntitie) {
        return usuarioRepository.save(usuarioEntitie);
    }

    public void delete(UsuarioEntitie usuarioEntitie) {
        usuarioRepository.delete(usuarioEntitie);
    }

    public Optional<UsuarioEntitie> getUsuario(int id){
        return usuarioRepository.findById(id);
    }

}
