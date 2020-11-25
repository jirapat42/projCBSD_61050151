/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Vector;
import javax.persistence.EntityManager;

/**
 *
 * @author 61050151
 */
public class CatdvdTable {
    public static Vector<Catdvd> findAllCatdvd(EntityManager em) {
        Vector<Catdvd> CatDvdList = null;
        try {
            CatDvdList = (Vector<Catdvd>) em.createNamedQuery("Catdvd.findAll").getResultList();
            //em.close();
            
        } catch (Exception e) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
        return CatDvdList;
    }
    public static Catdvd findDvdByNamedvd(EntityManager em, String name) {
        Catdvd CatDvd = null;
        try {
            CatDvd = em.find(Catdvd.class, name);
            //em.close();
            
        } catch (Exception e) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
        return CatDvd;
    }
    //public static int updateEmployee(EntityManager em, 
    //        UserTransaction utx, Employee emp) {
    public static int updateCatdvd(EntityManager em, Catdvd cat) {
        try {
            em.getTransaction().begin();
            Catdvd target = em.find(Catdvd.class, cat.getNamedvd());
            if (target == null) {
                return 0;
            }
            target.setNamedvd(cat.getNamedvd());
            target.setPrice(cat.getPrice());
            em.persist(target);
            em.getTransaction().commit();
        } catch (Exception e) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
            
        }
        return 1;
        
    }
    public static int removeCatdvd(EntityManager em, int id) {
        try {
            em.getTransaction().begin();
            Catdvd target = em.find(Catdvd.class, id);
            if (target == null) {
                return 0;
            }
            em.remove(target);
            em.getTransaction().commit();
        } catch (Exception e) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
            
        }
        return 1;
    }
    
    public static int insertCatdvd(EntityManager em, Catdvd cat) {
        try {
            em.getTransaction().begin();
            Catdvd target = em.find(Catdvd.class, cat.getNamedvd());
            if (target != null) {
                return 0;
            }
            em.persist(cat);
            em.getTransaction().commit();
        } catch (Exception e) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
            
        }
        return 1;
    }
}
