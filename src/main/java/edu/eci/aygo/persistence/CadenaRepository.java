package edu.eci.aygo.persistence;

import edu.eci.aygo.model.game.entities.Cadena;
import java.util.Set;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Juan Pablo Arévalo
 */
public interface CadenaRepository extends MongoRepository<Cadena, Integer>{

   public Cadena insert(Cadena cadena);
    
}
