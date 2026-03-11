package com.zakiah.pelanggan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zakiah.pelanggan.model.pelanggan;

public interface PelangganRepository extends JpaRepository<pelanggan, Long> {

}