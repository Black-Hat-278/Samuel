/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hack.Vlc.service.impl;

import Hack.Vlc.entity.Editorial;
import Hack.Vlc.repository.EditorialRepository;
import Hack.Vlc.service.EditorialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Black-Hat-278
 */

@Service
public class EditorialServiceImpl implements EditorialService{


@Autowired
EditorialRepository EditorialRepository;


@Override
public List<Editorial> findAll(){
return (List<Editorial>) EditorialRepository.findAll();
}

 @Override
public Editorial findById(Long id) {
return EditorialRepository.findById(id).orElse(null);
}

 @Override
public Editorial save (Editorial editorial){
    return EditorialRepository.save(editorial);
}

@Override
public void delete (Editorial editorial) {
 EditorialRepository.delete(editorial);
}

@Override
public void deleteById (Long id) {
EditorialRepository.deleteById(id);
}  
  
}
