package com.dio.live.controller;

import com.dio.live.model.TipoData;
import com.dio.live.service.TipoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tiposdata")
public class TipoDataController {

    @Autowired
    TipoDataService tipoDataService;

    @PostMapping
    public TipoData create(@RequestBody TipoData tipoData){
        return tipoDataService.save(tipoData);
    }

    @PutMapping
    public TipoData update(@RequestBody TipoData tipoData){
        return tipoDataService.update(tipoData);
    }

    @GetMapping
    public List<TipoData> getJornadaTrabalhoList(){
        return tipoDataService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoData> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(tipoDataService.findById(id).orElseThrow(() -> new Exception("Tipo de data não encontrado")));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        tipoDataService.delete(id);
    }
}
