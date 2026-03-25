package com.example.bibliotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaduoc.model.Libro;


@Repository
public class LibroRepository {
    // Array que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    // Metodo que retorna todos los libros
    public List<Libro> obtenerLibros(){
        return listaLibros;
    }
    
    // Metodo para buscar libro por su id
    public Libro buscarPorId(int id){
        for(Libro libro : listaLibros){
            if(libro.getId() == id){
                return libro;
            }
        }
        return null;
    }
    
    // Metodo para buscar libro por su isbn
    public Libro buscarPorIsbn(String isbn){
        for(Libro libro : listaLibros){
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    // Metodo para guardar libro
    public Libro guardar(Libro lib){
        listaLibros.add(lib);
        return lib;
    }

    // Metodo para actualizar libro
    public Libro actualizar(Libro lib){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i < listaLibros.size(); i++){
            if(listaLibros.get(i).getId() == lib.getId()){
                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;
    }

    // Metodo para eliminar libro
    public void eliminar(int id){
        Libro libro = buscarPorId(id);
        if(libro != null){
            listaLibros.remove(libro);
        }
    }
    
}
