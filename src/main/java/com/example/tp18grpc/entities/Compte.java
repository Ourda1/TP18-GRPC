package com.example.tp18grpc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Version;

import java.util.UUID;

@Entity
public class Compte {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String id = UUID.randomUUID().toString();
    private float solde;
    private String dateCreation;
    private String type;

    @Version
    private Integer version;

    // Getters et Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public float getSolde() { return solde; }
    public void setSolde(float solde) { this.solde = solde; }

    public String getDateCreation() { return dateCreation; }
    public void setDateCreation(String dateCreation) { this.dateCreation = dateCreation; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type;
    }
    public Integer getVersion() { return version; }
    public void setVersion(Integer version) { this.version = version; }


}