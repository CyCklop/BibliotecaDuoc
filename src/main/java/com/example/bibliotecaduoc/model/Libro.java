package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor; // genera un constructor con todos los atributos de una clase
import lombok.Data; // genera los getters, setters, toString, etc
import lombok.NoArgsConstructor; // genera contructor vacio

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}
