package com.dio.live.service;

import com.dio.live.model.Movimentacao;
import com.dio.live.model.MovimentacaoId;
import com.dio.live.model.Usuario;
import com.dio.live.repository.MovimentacaoRepository;
import com.dio.live.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {

    final
    MovimentacaoRepository movimentacaoRepository;

    @Autowired
    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public Movimentacao save(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao update(Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }

    public void delete(MovimentacaoId movimentacaoId){
        movimentacaoRepository.deleteById(movimentacaoId);
    }

    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> findById(MovimentacaoId movimentacaoId){
        return movimentacaoRepository.findById(movimentacaoId);
    }
}
