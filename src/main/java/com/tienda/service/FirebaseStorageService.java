package com.tienda.service;

<<<<<<< HEAD
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService{
=======
import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-3db54.firebasestorage.app";

    //Esta es la ruta básica de este proyecto Techshop
<<<<<<< HEAD
    final String rutaSuperiorStorage = "techshopACM";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-3db54-firebase-adminsdk-fbsvc-03304863ae.json";
=======
    final String rutaSuperiorStorage = "techshopKDTB";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-3db54-firebase-adminsdk-fbsvc-7cc4030d6a";
>>>>>>> f944b19080e2ca2d9e6c50c5f7e2413208636357
}