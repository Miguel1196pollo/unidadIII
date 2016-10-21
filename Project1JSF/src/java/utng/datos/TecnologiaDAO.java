/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Tecnologia;

/**
 *
 * @author Miguel González
 */
public class TecnologiaDAO extends DAO<Tecnologia>{
        
        public TecnologiaDAO(){
                super(new Tecnologia());
        }
        
        public Tecnologia getOneById(Tecnologia tecnologia)
                        throws HibernateException {
                return super.getOneById(
                                tecnologia.getIdTecnologia());
        }
    
}
