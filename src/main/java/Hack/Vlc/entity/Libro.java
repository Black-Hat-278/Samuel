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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Black-Hat-278
 */


@Entity 
@Data
@Table (name ="libro")
public class Libro {

@Id 
@Column (name = "lib_id")
@GeneratedValue (strategy = GenerationType.IDENTITY)
private Long libId;


@Column (name = "lib_nombrelibro")
private String libNombrelibro;

@Column (name = "lib_autor")
private String libAutor;

@Column (name = "lib_comentario")
private String libComentario;

@Column (name = "lib_niveldecapitulo")
private String libNiveldecapitulo;

@Column (name = "lib_precio")
private int libPrecio; 

@Column (name = "lib_numpag")
private int libNumpag;


@ManyToOne
@JoinColumn(name = "edi_id")
private Editorial editorial; 
  
}
