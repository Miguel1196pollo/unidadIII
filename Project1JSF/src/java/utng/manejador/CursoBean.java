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
import utng.datos.CursoDAO;
import utng.modelo.Tecnologia;
import utng.modelo.Curso;
/**
 *
 * @author Miguel González
 */
@ManagedBean (name = "cursoBean") @SessionScoped
public class CursoBean implements Serializable{

    private List<Curso> cursos;
    private Curso curso;
    private List<Tecnologia> tecnologias;
    public CursoBean(){
        curso = new Curso();
        curso.setTecnologia(new Tecnologia());
    }

    public List<Tecnologia> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<Tecnologia> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    public String listar(){
        CursoDAO dao = new CursoDAO();
        try{
            cursos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Cursos";
    }
    public String eliminar(){
         CursoDAO dao = new CursoDAO();
        try{
            dao.delete(curso);
            cursos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Eliminar";
    }
    public String iniciar(){
        curso = new Curso();
        curso.setTecnologia(new Tecnologia());
        try{
            tecnologias = new TecnologiaDAO().getAll();
        }catch(Exception e){
            e.printStackTrace(); 
        } 
        return "Iniciar";
    }
    public String guardar(){
        CursoDAO dao = new CursoDAO();
        try{
            if(curso.getIdCurso()!=0){
                dao.update(curso);
            }else{
                dao.insert(curso);
            }
            cursos = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Curso curso){
        this.curso = curso;
        try{
            tecnologias = new TecnologiaDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Editar";
    }
    
}