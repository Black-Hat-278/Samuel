/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hack.Vlc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Black-Hat-278
 */

@Entity
@Data
@Table (name="editorial")

public class Editorial {
    
@Id
@Column(name="edi_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long ediId; 

@Column (name= "edi_nombre")
private String ediNombre; 

@Column (name="edi_descrpcion")
private String ediDescripcion; 

}


