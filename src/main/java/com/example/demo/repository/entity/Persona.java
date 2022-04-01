package com.example.demo.repository.entity;


import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personas")
@Getter
@Setter
public class Persona {

	
	/*Definición de variables [Col y Tablas]===============================*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length=50, nullable=false)
    private String nombres;
    
    @Column(length=50, nullable=false)
    private String apellidos;
    
    @Column(nullable=false)
    private int documento;
    
    @Column
    private int telefono;

}
