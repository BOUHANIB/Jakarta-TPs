/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.emsi.tpcustomerbouhanib.ejb;
import ma.emsi.tpcustomerbouhanib.entities.Customer;
import java.util.List;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;


/**
 *
 * @author Othmane
 *La variable em ne doit pas être initialisée car sa valeur va être "injectée" par le serveur d'application, 
grâce à l'annotation @PersistenceContext.C'est comme si le code disait "Serveur, donne-moi un objet pour 
gérer les données de la base customer.".
*/
@Stateless
public class CustomerManager {

    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    public List<Customer> getAllCustomers() {
       Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    }

    public Customer update(Customer customer) {
       return em.merge(customer);
    }

    public void persist(Customer customer) {
       em.persist(customer);
    }
}