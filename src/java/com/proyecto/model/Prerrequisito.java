package com.proyecto.model;
// Generated 06-08-2013 11:30:49 AM by Hibernate Tools 3.2.1.GA



/**
 * Prerrequisito generated by hbm2java
 */
public class Prerrequisito  implements java.io.Serializable {


     private PrerrequisitoId id;
     private Materia materia;
     private String nombreprerrequisito;

    public Prerrequisito() {
    }

	
    public Prerrequisito(PrerrequisitoId id, Materia materia) {
        this.id = id;
        this.materia = materia;
    }
    public Prerrequisito(PrerrequisitoId id, Materia materia, String nombreprerrequisito) {
       this.id = id;
       this.materia = materia;
       this.nombreprerrequisito = nombreprerrequisito;
    }
   
    public PrerrequisitoId getId() {
        return this.id;
    }
    
    public void setId(PrerrequisitoId id) {
        this.id = id;
    }
    public Materia getMateria() {
        return this.materia;
    }
    
    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public String getNombreprerrequisito() {
        return this.nombreprerrequisito;
    }
    
    public void setNombreprerrequisito(String nombreprerrequisito) {
        this.nombreprerrequisito = nombreprerrequisito;
    }




}

