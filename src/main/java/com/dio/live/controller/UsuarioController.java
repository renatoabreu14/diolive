package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.model.Usuario;
import com.dio.live.service.JornadaTrabalhoService;
import com.dio.live.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario){
        return usuarioService.update(usuario);
    }

    @GetMapping
    public List<Usuario> getJornadaTrabalhoList(){
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(usuarioService.findById(id).orElseThrow(() -> new Exception("Jornada de Trabalho não encontrada")));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        usuarioService.delete(id);
    }
}
