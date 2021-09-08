package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.model.Movimentacao;
import com.dio.live.model.MovimentacaoId;
import com.dio.live.service.JornadaTrabalhoService;
import com.dio.live.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    MovimentacaoService movimentacaoService;

    @PostMapping
    public Movimentacao create(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.save(movimentacao);
    }

    @PutMapping
    public Movimentacao update(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.update(movimentacao);
    }

    @GetMapping
    public List<Movimentacao> getJornadaTrabalhoList(){
        return movimentacaoService.findAll();
    }

    @GetMapping("/{movimento}/{usuario}")
    public ResponseEntity<Movimentacao> getJornadaTrabalhoById(@PathVariable("movimento") long movimento, @PathVariable("usuario") long usuario) throws Exception{
        MovimentacaoId movimentacaoId = new MovimentacaoId();
        movimentacaoId.setIdMovimento(movimento);
        movimentacaoId.setIdUsuario(usuario);
        return ResponseEntity.ok(movimentacaoService.findById(movimentacaoId).orElseThrow(() -> new Exception("Jornada de Trabalho não encontrada")));
    }

    @DeleteMapping("/{movimento}/{usuario}")
    public void delete(@PathVariable("movimento") long movimento, @PathVariable("usuario") long usuario){
        MovimentacaoId movimentacaoId = new MovimentacaoId();
        movimentacaoId.setIdMovimento(movimento);
        movimentacaoId.setIdUsuario(usuario);
        movimentacaoService.delete(movimentacaoId);
    }
}
