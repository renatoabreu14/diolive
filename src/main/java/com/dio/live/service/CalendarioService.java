package com.dio.live.service;

import com.dio.live.model.Calendario;
import com.dio.live.repository.CalendarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarioService {

    final
    CalendarioRepository calendarioRepository;

    @Autowired
    public CalendarioService(CalendarioRepository calendarioRepository) {
        this.calendarioRepository = calendarioRepository;
    }

    public Calendario save(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public Calendario update(Calendario calendario){
        return calendarioRepository.save(calendario);
    }

    public void delete(Long id){
        calendarioRepository.deleteById(id);
    }

    public List<Calendario> findAll(){
        return calendarioRepository.findAll();
    }

    public Optional<Calendario> findById(Long id){
        return calendarioRepository.findById(id);
    }
}
