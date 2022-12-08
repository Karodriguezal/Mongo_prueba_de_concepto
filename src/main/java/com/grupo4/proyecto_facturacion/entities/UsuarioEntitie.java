package com.grupo4.proyecto_facturacion.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "usuario")

public class UsuarioEntitie {

    @Id
    private Integer usuarioId;


    private String name;


    private String surname;


    private Long docuemnt;


    private Integer cantHijos ;


    private Date fehaNacimiento;

    public UsuarioEntitie(Integer usuarioId, String name, String surname, Long docuemnt, Integer cantHijos, Date fehaNacimiento) {
        this.usuarioId = usuarioId;
        this.name = name;
        this.surname = surname;
        this.docuemnt = docuemnt;
        this.cantHijos = cantHijos;
        this.fehaNacimiento = fehaNacimiento;
    }
    public UsuarioEntitie() {

    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getDocuemnt() {
        return docuemnt;
    }

    public void setDocuemnt(Long docuemnt) {
        this.docuemnt = docuemnt;
    }

    public Integer getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(Integer cantHijos) {
        this.cantHijos = cantHijos;
    }

    public Date getFehaNacimiento() {
        return fehaNacimiento;
    }

    public void setFehaNacimiento(Date fehaNacimiento) {
        this.fehaNacimiento = fehaNacimiento;
    }
}
