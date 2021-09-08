package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping(value = "")
    public JornadaTrabalho create(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.save(jornadaTrabalho);
    }

    @PutMapping(value = "")
    public JornadaTrabalho update(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.update(jornadaTrabalho);
    }

    @GetMapping(value = "")
    public List<JornadaTrabalho> getJornadaTrabalhoList(){
        return jornadaTrabalhoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(jornadaTrabalhoService.findById(id).orElseThrow(() -> new Exception("Jornada de Trabalho não encontrada")));
    }


}
