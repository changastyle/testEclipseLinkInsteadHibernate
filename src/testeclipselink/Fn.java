package testeclipselink;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nico
 */
public class Fn
{
    private static final String PERSISTENCE_UNIT_NAME = "testEclipseLinkPU";
    private EntityManagerFactory factory;
  
  public void consultar()
  {
      long timestampIncial = System.currentTimeMillis();
      factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
      EntityManager em = factory.createEntityManager();

        // Begin a new local transaction so that we can persist a new entity
        em.getTransaction().begin();

        // read the existing entries
        Query q = em.createQuery("select e from Excursiones e");
        em.getTransaction().commit();

        long timestampfinal = System.currentTimeMillis();
        // Persons should be empty
    
        System.out.println("tiempo= " + (timestampfinal - timestampIncial));
      System.out.println(q.getResultList());

  }
}
