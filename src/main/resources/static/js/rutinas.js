
<dependency>
    <groupId>com.google.firebase</groupId>
    <artifactId>firebase-admin</artifactId>
    <version>9.1.1</version>
</dependency>

        Recorte 000b (ajuste a versión, si se usa JDK 21)
        === === === ==
        <dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version>
</dependency>


        Recorte 001
        === === === ==
        package com.tienda.service;
import org.springframework.web.multipart.MultipartFile;
        public interface FirebaseStorageService {

        public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
                //El BuketName es el <id_del_proyecto> + ".appspot.com"
                final String BucketName = "xxidProjectxx.appspot.com";
                //Esta es la ruta básica de este proyecto Techshop
                final String rutaSuperiorStorage = "techshop";
                //Ubicación donde se encuentra el archivo de configuración Json
                final String rutaJsonFile = "firebase";
                //El nombre del archivo Json
                final String archivoJsonFile = "xxxNombre del archivo Json";
                }


