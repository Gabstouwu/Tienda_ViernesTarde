package com.tienda_vt.service;

import com.tienda_vt.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //Se define la firma del metodo que recupera la lista de objetos tipo Categoria de la tabla categoria
    public List<Categoria> getCategorias(boolean activos);

    //se define la firma del metodo para recuperar un registros de la tabla categoria
    public Categoria getCategoria(Categoria categoria);

    /// se define la tabla para  crear o actualizar el registro de categoria
    public void save(Categoria categoria);

    /// se define la tabla para  eliminar el registro de categoria
    public void delete(Categoria categoria);
}
