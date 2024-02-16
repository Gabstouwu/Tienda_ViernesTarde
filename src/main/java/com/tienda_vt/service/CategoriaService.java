package com.tienda_vt.service;

import com.tienda_vt.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Se define la firma del metodo que recupera la lista de objetos tipo Categoria de la tabla categoria
    public List<Categoria> getCategorias(boolean activos);
    
}
