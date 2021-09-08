package com.dio.live.service;

import com.dio.live.model.NivelAcesso;
import com.dio.live.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    final
    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public NivelAcesso save(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public NivelAcesso update(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);
    }

    public void delete(Long id){
        nivelAcessoRepository.deleteById(id);
    }

    public List<NivelAcesso> findAll(){
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> findById(Long id){
        return nivelAcessoRepository.findById(id);
    }
}
