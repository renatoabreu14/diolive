package com.dio.live.service;

import com.dio.live.model.Localidade;
import com.dio.live.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {

    final
    LocalidadeRepository localidadeRepository;

    @Autowired
    public LocalidadeService(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    public Localidade save(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public Localidade update(Localidade localidade){
        return localidadeRepository.save(localidade);
    }

    public void delete(Long id){
        localidadeRepository.deleteById(id);
    }

    public List<Localidade> findAll(){
        return localidadeRepository.findAll();
    }

    public Optional<Localidade> findById(Long id){
        return localidadeRepository.findById(id);
    }
}
