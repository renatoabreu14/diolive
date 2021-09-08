package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendarios")
public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario create(@RequestBody Calendario calendario){
        return calendarioService.save(calendario);
    }

    @PutMapping
    public Calendario update(@RequestBody Calendario calendario){
        return calendarioService.update(calendario);
    }

    @GetMapping
    public List<Calendario> getJornadaTrabalhoList(){
        return calendarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendario> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(calendarioService.findById(id).orElseThrow(() -> new Exception("Calendário não encontrado")));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        calendarioService.delete(id);
    }
}
