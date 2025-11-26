package com.example.tp18grpc.repositories;


import com.example.tp18grpc.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {
}
