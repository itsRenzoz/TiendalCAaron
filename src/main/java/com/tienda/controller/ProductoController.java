package com.tienda.controller;

import com.tienda.domain.Producto;
import com.tienda.service.ProductoService;
import com.tienda.service.CategoriaService;
import com.tienda.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/producto")
public class ProductoController {
<<<<<<< HEAD
    
    @Autowired
    private ProductoService productoService;
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String listado(Model model) {
      var lista=productoService.getProductos(false);
      var categorias=categoriaService.getCategorias(false);
      model.addAttribute("productos", lista);
      model.addAttribute("categorias",categorias);
      model.addAttribute("totalProductos", lista.size());
      return "/producto/listado";
    }
    
       

    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping("/guardar")
    public String productoGuardar(Producto producto,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
=======

    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista=productoService.getProductos(false);
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("productos", lista);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalProductos", lista.size());
        return "/producto/listado";
    }



    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;

    @PostMapping("/guardar")
    public String productoGuardar(Producto producto, @RequestParam("imagenFile") MultipartFile imagenFile) {
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
        if (!imagenFile.isEmpty()) {
            productoService.save(producto);
            producto.setRutaImagen(
                    firebaseStorageService.cargaImagen(
<<<<<<< HEAD
                            imagenFile, 
                            "producto", 
=======
                            imagenFile,
                            "producto",
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
                            producto.getIdProducto()));
        }
        productoService.save(producto);
        return "redirect:/producto/listado";
    }

    @GetMapping("/eliminar/{idProducto}")
    public String productoEliminar(Producto producto) {
        productoService.delete(producto);
        return "redirect:/producto/listado";
    }

    @GetMapping("/modificar/{idProducto}")
    public String productoModificar(Producto producto, Model model) {
        producto = productoService.getProducto(producto);
<<<<<<< HEAD
        var categorias=categoriaService.getCategorias(false);
        model.addAttribute("producto", producto);
        model.addAttribute("categorias",categorias);
=======
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);
        model.addAttribute("producto", producto);
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
        return "/producto/modifica";
    }
}
