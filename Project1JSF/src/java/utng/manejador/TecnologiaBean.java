/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.TecnologiaDAO;
import utng.modelo.Tecnologia;

/**
 *
 * @author Miguel González
 */
@ManagedBean @SessionScoped
public class TecnologiaBean implements Serializable{
    private List<Tecnologia> tecnologias;
    private Tecnologia tecnologia;
    
    public TecnologiaBean(){
            // Todo Auto-generated constructor stub
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }
    
    public String listar(){
            TecnologiaDAO dao = new TecnologiaDAO();
            try {
                tecnologias = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
            return "Tecnologias";
    }
    public String eliminar(){
        TecnologiaDAO dao = new TecnologiaDAO();
        try {
                dao.delete(tecnologia);
                tecnologias = dao.getAll();
        } catch (Exception e) {
                e.printStackTrace();
        }
        return "Eliminar";
    }
    public String  iniciar(){
            tecnologia = new Tecnologia();
            return "Iniciar";
    }
    
    public String guardar () {
    TecnologiaDAO dao = new TecnologiaDAO();
        try {
                if(tecnologia.getIdTecnologia()!=0){
                        dao.update(tecnologia);
                }else{
                    dao.insert(tecnologia);
                }
                tecnologias = dao.getAll();
        } catch (Exception e) {
                e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
            return "Cancelar";
    }
    public  String editar(Tecnologia tecnologia){
        this.tecnologia = tecnologia;
        return "Editar";
    }
    
}

