/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.emsi.tpbanquebouhanib.ejb;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import ma.emsi.tpbanquebouhanib.entities.CompteBancaire;
/**
 *
 * @author Othmane
 */

public class Init {
    @EJB
  private GestionnaireCompte gestionnaireCompte;

  @PostConstruct
  public void initComptes() {

    gestionnaireCompte.creerCompte(new CompteBancaire("John Lennon", 150000));
    gestionnaireCompte.creerCompte(new CompteBancaire("Paul McCartney", 950000));
    gestionnaireCompte.creerCompte(new CompteBancaire("Ringo Starr", 20000));
    gestionnaireCompte.creerCompte(new CompteBancaire("Georges Harrisson", 100000));
  }
}
