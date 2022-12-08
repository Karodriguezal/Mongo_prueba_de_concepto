package com.grupo4.proyecto_facturacion.repository.crudrepository;

import com.grupo4.proyecto_facturacion.entities.UsuarioEntitie;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UsuarioRepository extends MongoRepository<UsuarioEntitie, Integer> {
}
