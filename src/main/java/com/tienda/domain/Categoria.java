package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
<<<<<<< HEAD
    
=======

>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long idCategoria;

    private String descripcion;
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    private boolean activo;

    @OneToMany
<<<<<<< HEAD
    @JoinColumn(name="id_categoria",updatable=false)
    List<Producto> productos;
    
=======
    @JoinColumn(name = "id_categoria", updatable = false)
    List<Producto> productos;

>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
<<<<<<< HEAD
    
    
=======
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357

}
