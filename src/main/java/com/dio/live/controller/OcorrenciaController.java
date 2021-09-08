package com.dio.live.controller;

import com.dio.live.model.Ocorrencia;
import com.dio.live.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {

    @Autowired
    OcorrenciaService ocorrenciaService;

    @PostMapping
    public Ocorrencia create(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.save(ocorrencia);
    }

    @PutMapping
    public Ocorrencia update(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.update(ocorrencia);
    }

    @GetMapping
    public List<Ocorrencia> getJornadaTrabalhoList(){
        return ocorrenciaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ocorrencia> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(ocorrenciaService.findById(id).orElseThrow(() -> new Exception("Ocorrência não encontrada")));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        ocorrenciaService.delete(id);
    }
}
