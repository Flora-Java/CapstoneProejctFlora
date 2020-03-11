/**
 * File: 			AbstractServices.java
 * Author: 			Flora Lopez
 * Date created: 	2/10/2020
 * Date modified:	2/22/2020 by Flora Lopez
 * 
 */

package org.perscholas.jpa.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.*;

/**
 * 
 * @author Flora
 * Description: Abstract class to be used for the class services of the entities.
 *
 */
public abstract class AbstractServices {
	protected EntityManagerFactory emf;
	protected EntityManager em;
	
	public AbstractServices() {
		emf = Persistence.createEntityManagerFactory("CaseStudyFlora");
		em = emf.createEntityManager();

	}
	
	public AbstractServices(String PU) {  
		emf = Persistence.createEntityManagerFactory(PU);
		em = emf.createEntityManager();
	}
	
	protected void cleanup() {
		em.close();
		emf.close();
	}
}
