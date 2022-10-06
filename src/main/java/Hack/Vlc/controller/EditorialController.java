/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hack.Vlc.controller;

import Hack.Vlc.entity.Editorial;
import Hack.Vlc.service.EditorialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Black-Hat-278
 */

@RestController
@RequestMapping ("/editoriales")
@Api (value = "Gestion de servicios de editoriales Black_hat", description = "Gestios de servicios de editoriales Black_hat" )

public class EditorialController {
  
@Autowired
EditorialService editorialService; 

@ApiOperation (value = "Lista de Editoriales")
@GetMapping ("/all")
public List<Editorial> findAll(){
    return editorialService.findAll();
}


@ApiOperation (value = "Obtiene los datos de una editorial")
@GetMapping ("/{id}")
public ResponseEntity<Editorial> findById(@PathVariable Long id){
        Editorial editorial = editorialService.findById(id);
        return ResponseEntity.ok(editorial);
}
  

@ApiOperation (value = "Crea los datos de una editorial")
@GetMapping ("/save")

public Editorial save ( @RequestBody Editorial editorial){
    return editorialService.save(editorial); 
}


@ApiOperation (value = "Modifica los datos de una editorial")
@GetMapping ("/update")

public Editorial update (@RequestBody Editorial editorial){
    return editorialService.save(editorial);
}

@ApiOperation (value = "Elimina los datos de una editorial")
@GetMapping ("/id")

public void deleteById(@PathVariable Long id) {
editorialService.deleteById(id);
}


}