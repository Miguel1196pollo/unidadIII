/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Miguel González
 */
@Entity @Table(name ="curso")
public class Curso implements Serializable{
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name ="id_curso")
        private Long idCurso;
        @Column (name = "nombre_curso", length = 20)
        private String nombreCurso;
        @Column (name= "tipo_curso", length = 40) 
        private String tipoCurso;
        @Column (name= "duracion_curso", length = 5) 
        private int duracion;
        @ManyToOne()
        @JoinColumn(name = "id_tecnologia")
        private Tecnologia tecnologia;
        public Curso (Long idCurso,String nombreCurso, String tipoCurso,int duracion, Tecnologia tecnologia){
                super();
                this.idCurso= idCurso;
                this.nombreCurso = nombreCurso;
                this.tipoCurso = tipoCurso;
                this.duracion = duracion;
                this.tecnologia = tecnologia;
        }

    
    public Curso() {
     this.idCurso=0L;
     
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    

    
   
    
    
}

