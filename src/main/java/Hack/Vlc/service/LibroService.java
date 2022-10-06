/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Hack.Vlc.service;

import Hack.Vlc.entity.Libro;
import java.util.List;

/**
 *
 * @author Black-Hat-278
 */
public interface LibroService {
 
    public List<Libro> findAll();
    public Libro findById(Long id);
    public Libro save (Libro libro);
    public void delete(Libro libro);
    public void deleteById(Long id);
   
}
