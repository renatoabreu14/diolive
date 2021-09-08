package com.dio.live.controller;

import com.dio.live.model.NivelAcesso;
import com.dio.live.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/niveis")
public class NivelAcessoController {

    @Autowired
    NivelAcessoService nivelAcessoService;

    @PostMapping
    public NivelAcesso create(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.save(nivelAcesso);
    }

    @PutMapping
    public NivelAcesso update(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.update(nivelAcesso);
    }

    @GetMapping
    public List<NivelAcesso> getJornadaTrabalhoList(){
        return nivelAcessoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NivelAcesso> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(nivelAcessoService.findById(id).orElseThrow(() -> new Exception("Nível de Acesso não encontrado")));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        nivelAcessoService.delete(id);
    }
}
