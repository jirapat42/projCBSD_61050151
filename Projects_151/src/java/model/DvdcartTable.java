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
public class DvdcartTable {
    public static Vector<Dvdcart> findAllCatdvd(EntityManager em) {
        Vector<Dvdcart> CatDvdList = null;
        try {
            CatDvdList = (Vector<Dvdcart>) em.createNamedQuery("Dvdcart.findAll").getResultList();
            //em.close();
            
        } catch (Exception e) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
        return CatDvdList;
    }
    public static Dvdcart findDvdByNamedvd(EntityManager em, String name) {
        Dvdcart CatDvd = null;
        try {
            CatDvd = em.find(Dvdcart.class, name);
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
            Dvdcart target = em.find(Dvdcart.class, cat.getNamedvd());
            if (target == null) {
                return 0;
            }
            target.setCnamedvd(cat.getNamedvd());
            target.setCrate(cat.getRate());
            target.setCyears(cat.getYears());
            target.setCprice(cat.getPrice());
            em.persist(target);
            em.getTransaction().commit();
        } catch (Exception e) {
            //Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
            
        }
        return 1;
        
    }
    public static int removeCatdvd(EntityManager em, String name) {
        try {
            em.getTransaction().begin();
            Dvdcart target = em.find(Dvdcart.class, name);
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
    
    public static int insertCatdvd(EntityManager em, Dvdcart cat) {
        try {
            em.getTransaction().begin();
            Dvdcart target = em.find(Dvdcart.class, cat.getCnamedvd());
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
