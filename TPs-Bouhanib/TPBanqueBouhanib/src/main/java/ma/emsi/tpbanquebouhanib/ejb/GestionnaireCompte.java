/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.emsi.tpbanquebouhanib.ejb;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.List;
import ma.emsi.tpbanquebouhanib.entities.CompteBancaire;

/**
 *
 * @author Othmane
 */

@DataSourceDefinition (
    className="com.mysql.cj.jdbc.MysqlDataSource",
    name="java:app/jdbc/banque",
    serverName="localhost",
    portNumber=3306,
    user="root",              // nom et
    password="root", // mot de passe que vous avez donnés lors de la création de la base de données
    databaseName="banque",
    properties = {
      "useSSL=false",
      "allowPublicKeyRetrieval=true"
    }
)

@Stateless
public class GestionnaireCompte {
   @PersistenceContext
    private EntityManager em;

    public void creerCompte(CompteBancaire compte) {
        em.persist(compte);
    }

    public List<CompteBancaire> getAllComptes() {
        TypedQuery query
                = em.createNamedQuery("CompteBancaire.findAll", CompteBancaire.class);
        return query.getResultList();
    } 
    
    public long nbComptes() {
    TypedQuery<Long> query
            = em.createQuery("select count(c) from CompteBancaire c", Long.class);
    return query.getSingleResult();
  }
}
