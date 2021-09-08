package com.dio.live.controller;

import com.dio.live.model.Localidade;
import com.dio.live.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidades")
public class LocalidadeController {

    @Autowired
    LocalidadeService localidadeService;

    @PostMapping
    public Localidade create(@RequestBody Localidade localidade){
        return localidadeService.save(localidade);
    }

    @PutMapping
    public Localidade update(@RequestBody Localidade localidade){
        return localidadeService.update(localidade);
    }

    @GetMapping
    public List<Localidade> getJornadaTrabalhoList(){
        return localidadeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Localidade> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(localidadeService.findById(id).orElseThrow(() -> new Exception("Localidade não encontrada")));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        localidadeService.delete(id);
    }
}
