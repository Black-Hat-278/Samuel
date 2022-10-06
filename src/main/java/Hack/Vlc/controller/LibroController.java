/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hack.Vlc.controller;

import Hack.Vlc.entity.Libro;
import Hack.Vlc.service.LibroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Black-Hat-278
 */


@RestController
@RequestMapping("/libro")
@Api(value = "Servicios de Gestion de libros balck_hat2708", description = "Servicios de Gestion de libros balck_hat2708")
public class LibroController {

   @Autowired
  LibroService libroService;

    @ApiOperation(value = "Lista de libros")
    @GetMapping("/all")
    public List<Libro> findAll(){
        return libroService.findAll();
    }

   @ApiOperation(value = "Obtiene datos de un libro de tu elecion")
    @GetMapping("/{id}")
    public ResponseEntity<Libro> findById(@PathVariable Long id){
        Libro libr = libroService.findById(id);
        return ResponseEntity.ok(libr);
    }
    
  @ApiOperation(value = "Crea un nuevo libro de tu elccion")
    @PostMapping("/save")
    public Libro save(@RequestBody Libro libr){
        return libroService.save(libr);
    }

  @ApiOperation(value = "Modifica un libro")
    @PutMapping("/update")
    public Libro update(@RequestBody Libro libr){
        return libroService.save(libr);
    }
  
    @ApiOperation(value = "Elimina un libro al igual que lo su flaca de Richi de sus favoritos")
    @DeleteMapping("/id")
    public void deleteById(@PathVariable Long id){
        libroService.deleteById(id);
    }
    
}
