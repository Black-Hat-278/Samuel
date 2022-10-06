/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hack.Vlc.repository;

import Hack.Vlc.entity.Libro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Black-Hat-278
 */

@Repository 
public interface LibroRepository  extends CrudRepository<Libro, Long>{
    
}
