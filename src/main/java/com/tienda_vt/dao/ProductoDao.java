package com.tienda_vt.dao;

import com.tienda_vt.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long>{
    
}
