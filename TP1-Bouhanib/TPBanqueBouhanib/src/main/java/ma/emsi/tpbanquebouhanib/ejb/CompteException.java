/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.emsi.tpbanquebouhanib.ejb;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import ma.emsi.tpbanquebouhanib.entities.CompteBancaire;


/**
 *
 * @author Othmane
 */

public class CompteException extends Exception {

  public CompteException(String message) {
    super(message);
  }

  public CompteException(String message, Throwable cause) {
    super(message, cause);
  }

  public CompteException(Throwable cause) {
    super(cause);
  }
}
