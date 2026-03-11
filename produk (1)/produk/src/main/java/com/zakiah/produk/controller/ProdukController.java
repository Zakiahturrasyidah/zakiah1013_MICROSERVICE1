package com.zakiah.produk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping; 
import java.util.List;

import com.zakiah.produk.model.produk;
import com.zakiah.produk.service.ProdukService;

@RestController
@RequestMapping("/api/produk")
public class ProdukController {

    @Autowired
    private ProdukService produkService;

    @GetMapping
    public List<produk> getAllProduks(){
        return produkService.getAllProduks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<produk> getProdukEntity(@PathVariable Long id){
        produk produk = produkService.getProdukbyId(id);
        return produk != null ? ResponseEntity.ok(produk) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public produk createProduk(@RequestBody produk produk){
        return produkService.createProduk(produk);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduk(@PathVariable Long id){
        produkService.deleteProduk(id);
        return ResponseEntity.noContent().build();
    }
}