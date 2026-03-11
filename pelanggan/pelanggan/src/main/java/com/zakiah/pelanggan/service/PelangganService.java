package com.zakiah.pelanggan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zakiah.pelanggan.model.pelanggan;
import com.zakiah.pelanggan.repository.PelangganRepository;

@Service
public class PelangganService {

    @Autowired
    private PelangganRepository pelangganRepository;

    public List<pelanggan> getAllPelanggan(){
        return pelangganRepository.findAll();
    }

    public pelanggan getPelangganById(Long id){
        return pelangganRepository.findById(id).orElse(null);
    }

    public pelanggan createPelanggan(pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }

    public void deletePelanggan(Long id){
        pelangganRepository.deleteById(id);
    }
}