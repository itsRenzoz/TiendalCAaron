package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
<<<<<<< HEAD
    
=======

>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;

    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    private boolean activo;
<<<<<<< HEAD
    
    @ManyToOne​
    @JoinColumn(name="id_categoria")
=======

    @ManyToOne
    @JoinColumn(name = "id_categoria")
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
    Categoria categoria;

    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencias, String imagen, boolean activo) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = imagen;
        this.activo = activo;
    }
<<<<<<< HEAD
    
    

=======
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
}
