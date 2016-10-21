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
import javax.persistence.Table;

/**
 *
 * @author Miguel González
 */
@Entity @Table(name="tecnologia")
public class Tecnologia implements Serializable{
        @Id
        @GeneratedValue(
                        strategy = GenerationType.IDENTITY)
        @Column(name="id_tecnologia")
        private Long idTecnologia;
        @Column(length = 30)
        private String nombreTecnologia;
        @Column(length = 30)
        private String tipoTecnologia;
        @Column(length = 30)
        private int version;
        
        
        public Tecnologia() {
                this.idTecnologia = 0L;
        }

    public Long getIdTecnologia() {
        return idTecnologia;
    }

    public void setIdTecnologia(Long idTecnologia) {
        this.idTecnologia = idTecnologia;
    }

    public String getNombreTecnologia() {
        return nombreTecnologia;
    }

    public void setNombreTecnologia(String nombreTecnologia) {
        this.nombreTecnologia = nombreTecnologia;
    }

    public String getTipoTecnologia() {
        return tipoTecnologia;
    }

    public void setTipoTecnologia(String tipoTecnologia) {
        this.tipoTecnologia = tipoTecnologia;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
    
            
}

