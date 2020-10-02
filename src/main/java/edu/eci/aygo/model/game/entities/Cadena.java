package edu.eci.aygo.model.game.entities;


import java.sql.Timestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Juan Pablo Arévalo
 */
@Document(collection = "cadenas")
public class Cadena {
	@Id
    private Timestamp timeStamp;
    private String name;
    
    public Cadena(String name) {
        this.timeStamp = new Timestamp(System.currentTimeMillis());
        this.name = name;
    }

    public Cadena() {
        this.timeStamp = new Timestamp(System.currentTimeMillis());
    }

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
