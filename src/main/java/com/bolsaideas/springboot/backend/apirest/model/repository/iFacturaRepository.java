package com.bolsaideas.springboot.backend.apirest.model.repository;

import com.bolsaideas.springboot.backend.apirest.model.entity.Factura;
import org.springframework.data.repository.CrudRepository;

/*1.- CRUD FACTURA --> iClienteService*/
public interface iFacturaRepository extends CrudRepository<Factura, Long> {
}
