package com.dio.live.controller;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.service.CategoriaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaUsuarioController {

    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;

    @PostMapping
    public CategoriaUsuario create(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.save(categoriaUsuario);
    }

    @PutMapping
    public CategoriaUsuario update(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.update(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> getJornadaTrabalhoList(){
        return categoriaUsuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaUsuario> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(categoriaUsuarioService.findById(id).orElseThrow(() -> new Exception("Categoria de Usuário não encontrada")));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        categoriaUsuarioService.delete(id);
    }
}
