package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {

    final
    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario save(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario update(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public void delete(Long id){
        categoriaUsuarioRepository.deleteById(id);
    }

    public List<CategoriaUsuario> findAll(){
        return categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> findById(Long id){
        return categoriaUsuarioRepository.findById(id);
    }
}
