package com.tiendaRopa.Infraestructura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class RopaDao{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TiendaRopa");
    private static EntityManager em = emf.createEntityManager();

}
