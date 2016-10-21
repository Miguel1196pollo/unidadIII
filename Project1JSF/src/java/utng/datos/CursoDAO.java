/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Curso;

/**
 *
 * @author Miguel González
 */
public class CursoDAO extends DAO<Curso>{
   
    public CursoDAO(){
        super(new Curso());
    }
    public Curso getOneById(Curso curso) 
            throws HibernateException{
        return super.getOneById(curso.getIdCurso());        
    }
    
}
