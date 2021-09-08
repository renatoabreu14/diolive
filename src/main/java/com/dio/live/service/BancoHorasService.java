package com.dio.live.service;

import com.dio.live.model.BancoHoras;
import com.dio.live.model.BancoHorasId;
import com.dio.live.model.Usuario;
import com.dio.live.repository.BancoHorasRepository;
import com.dio.live.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoHorasService {

    final
    BancoHorasRepository bancoHorasRepository;

    @Autowired
    public BancoHorasService(BancoHorasRepository bancoHorasRepository) {
        this.bancoHorasRepository = bancoHorasRepository;
    }

    public BancoHoras save(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public BancoHoras update(BancoHoras bancoHoras){
        return bancoHorasRepository.save(bancoHoras);
    }

    public void delete(BancoHorasId bancoHorasId){
        bancoHorasRepository.deleteById(bancoHorasId);
    }

    public List<BancoHoras> findAll(){
        return bancoHorasRepository.findAll();
    }

    public Optional<BancoHoras> findById(BancoHorasId bancoHorasId){
        return bancoHorasRepository.findById(bancoHorasId);
    }
}
