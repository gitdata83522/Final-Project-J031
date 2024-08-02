package com.sunbeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Seller;

public interface SellerDao  extends JpaRepository<Seller, Long>  {

}
