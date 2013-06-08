package com.proyecto.model;
// Generated 06-08-2013 11:30:49 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cargo generated by hbm2java
 */
public class Cargo  implements java.io.Serializable {


     private CargoId id;
     private Docente docente;
     private Departamento departamento;
     private String nombrecargo;
     private Date fechainiciocargo;
     private Date fechafincargo;
     private Set<Propuesta> propuestas = new HashSet<Propuesta>(0);

    public Cargo() {
    }

	
    public Cargo(CargoId id, Docente docente, Departamento departamento) {
        this.id = id;
        this.docente = docente;
        this.departamento = departamento;
    }
    public Cargo(CargoId id, Docente docente, Departamento departamento, String nombrecargo, Date fechainiciocargo, Date fechafincargo, Set<Propuesta> propuestas) {
       this.id = id;
       this.docente = docente;
       this.departamento = departamento;
       this.nombrecargo = nombrecargo;
       this.fechainiciocargo = fechainiciocargo;
       this.fechafincargo = fechafincargo;
       this.propuestas = propuestas;
    }
   
    public CargoId getId() {
        return this.id;
    }
    
    public void setId(CargoId id) {
        this.id = id;
    }
    public Docente getDocente() {
        return this.docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getNombrecargo() {
        return this.nombrecargo;
    }
    
    public void setNombrecargo(String nombrecargo) {
        this.nombrecargo = nombrecargo;
    }
    public Date getFechainiciocargo() {
        return this.fechainiciocargo;
    }
    
    public void setFechainiciocargo(Date fechainiciocargo) {
        this.fechainiciocargo = fechainiciocargo;
    }
    public Date getFechafincargo() {
        return this.fechafincargo;
    }
    
    public void setFechafincargo(Date fechafincargo) {
        this.fechafincargo = fechafincargo;
    }
    public Set<Propuesta> getPropuestas() {
        return this.propuestas;
    }
    
    public void setPropuestas(Set<Propuesta> propuestas) {
        this.propuestas = propuestas;
    }




}


