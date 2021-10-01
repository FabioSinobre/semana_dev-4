package com.sinobre.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinobre.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}