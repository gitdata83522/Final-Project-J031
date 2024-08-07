package com.sunbeam.service;

import com.sunbeam.dto.SellerDTO;
import com.sunbeam.entities.Seller;
import com.sunbeam.repository.SellerRepository;
import com.sunbeam.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDTO> getAllSellers() {
        return sellerRepository.findAll().stream()
                .map(seller -> new SellerDTO(seller.getId(), seller.getName(), seller.getEmail(), null))
                .collect(Collectors.toList());
    }

    public SellerDTO getSellerById(Long id) {
        Seller seller = sellerRepository.findById(id).orElseThrow(() -> new CustomException("Seller not found"));
        return new SellerDTO(seller.getId(), seller.getName(), seller.getEmail(), null);
    }

    public SellerDTO saveSeller(SellerDTO sellerDTO) {
        Seller seller = new Seller(sellerDTO.getId(), sellerDTO.getName(), sellerDTO.getEmail(), null);
        seller = sellerRepository.save(seller);
        return new SellerDTO(seller.getId(), seller.getName(), seller.getEmail(), null);
    }

    public void deleteSeller(Long id) {
        sellerRepository.deleteById(id);
    }
}
