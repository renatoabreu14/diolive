package com.dio.live.controller;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.BancoHorasId;
import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.BancoHorasService;
import com.dio.live.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancohoras")
public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras create(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.save(bancoHoras);
    }

    @PutMapping
    public BancoHoras update(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.update(bancoHoras);
    }

    @GetMapping
    public List<BancoHoras> getJornadaTrabalhoList(){
        return bancoHorasService.findAll();
    }

    @GetMapping("/{banco}/{movimentacao}/{usuario}")
    public ResponseEntity<BancoHoras> getJornadaTrabalhoById(@PathVariable("banco") long banco, @PathVariable("movimentacao") long movimentacao, @PathVariable("usuario") long usuario) throws Exception{
        BancoHorasId bancoHorasId = new BancoHorasId();
        bancoHorasId.setIdBancoHoras(banco);
        bancoHorasId.setIdMovimentacao(movimentacao);
        bancoHorasId.setIdUsuario(usuario);
        return ResponseEntity.ok(bancoHorasService.findById(bancoHorasId).orElseThrow(() -> new Exception("Jornada de Trabalho não encontrada")));
    }

    @DeleteMapping("/{banco}/{movimentacao}/{usuario}")
    public void delete(@PathVariable("banco") long banco, @PathVariable("movimentacao") long movimentacao, @PathVariable("usuario") long usuario){
        BancoHorasId bancoHorasId = new BancoHorasId();
        bancoHorasId.setIdBancoHoras(banco);
        bancoHorasId.setIdMovimentacao(movimentacao);
        bancoHorasId.setIdUsuario(usuario);
        bancoHorasService.delete(bancoHorasId);
    }
}
