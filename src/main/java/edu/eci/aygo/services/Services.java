/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//NOTA: los comentarios no llevan acentos para evitar conflictos de codificacion
package edu.eci.aygo.services;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.aygo.model.game.entities.Cadena;
import edu.eci.aygo.persistence.CadenaRepository;
import edu.eci.aygo.persistence.PersistenceException;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Juan Pablo Arévalo
 */
@Service
public class Services {

	@Autowired
    CadenaRepository cadenaRepository;
 
    
    public Cadena addCadena(Cadena cadenaS) throws PersistenceException{
        return cadenaRepository.insert(cadenaS);
    }



    
}
