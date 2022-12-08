package com.grupo4.proyecto_facturacion.services;

import com.grupo4.proyecto_facturacion.entities.UsuarioEntitie;
import com.grupo4.proyecto_facturacion.repository.UsurioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsurioRepository usurioRepository;

    public List<UsuarioEntitie> getAll(){
        return usurioRepository.getAll();
    }

    public UsuarioEntitie save(UsuarioEntitie usuarioEntitie){
        usuarioEntitie.setUsuarioId(autoIncrement());
        return usurioRepository.save(usuarioEntitie);
    }

    public boolean delete(int usuarioId){
        boolean flag=false;
        Optional<UsuarioEntitie> p= usurioRepository.getUsuario(usuarioId);
        if(p.isPresent()){
            usurioRepository.delete(p.get());
            flag=true;
        }
        return flag;
    }

    public Optional<UsuarioEntitie> getUsuarioById(int usuarioId){
        return usurioRepository.getUsuario(usuarioId);
    }

    public UsuarioEntitie update(UsuarioEntitie usuarioEntitie){
        return usurioRepository.save(usuarioEntitie);
    }

    private int autoIncrement(){
        List<UsuarioEntitie> products = usurioRepository.getAll();
        return products.isEmpty()? 1 :
                products.stream().max(Comparator.comparing(UsuarioEntitie::getUsuarioId)).get().getUsuarioId() + 1;
    }
}
