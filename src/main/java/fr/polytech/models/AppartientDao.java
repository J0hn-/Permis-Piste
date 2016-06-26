package fr.polytech.models;

import javax.transaction.Transactional;

/**
 * Created by Cyril on 26/06/2016.
 */
@Transactional
public interface AppartientDao {
    /**
     * This method will find an User instance in the database by its email.
     * Note that this method is not implemented and its working code will be
     * automagically generated from its signature by Spring Data JPA.
     */
    Appartient findBynumjeu(Integer numjeu);
}
