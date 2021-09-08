package com.dio.live.controller;

import com.dio.live.model.Empresa;
import com.dio.live.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    @PutMapping
    public Empresa update(@RequestBody Empresa empresa){
        return empresaService.update(empresa);
    }

    @GetMapping
    public List<Empresa> getJornadaTrabalhoList(){
        return empresaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> getJornadaTrabalhoById(@PathVariable("id") long id) throws Exception{
        return ResponseEntity.ok(empresaService.findById(id).orElseThrow(() -> new Exception("Empresa não encontrada")));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        empresaService.delete(id);
    }
}
