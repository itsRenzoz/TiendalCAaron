package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
<<<<<<< HEAD
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    
   // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}
=======

    // Se obtiene un listado de categorias en un List........
    public List<Categoria> getCategorias(boolean activos);

    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria);

    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria);

    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
}
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
