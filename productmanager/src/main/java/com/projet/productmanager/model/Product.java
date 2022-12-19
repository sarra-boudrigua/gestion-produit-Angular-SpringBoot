package com.projet.productmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private Double prix;
    private String taille;
    private Long quantite;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String productCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Product() {}

    public Product(Long id, String name, Double prix, String taille, Long quantite, String imageUrl, String productCode) {
        this.id = id;
        this.name = name;
        this.prix = prix;
        this.taille = taille;
        this.quantite = quantite;
        this.imageUrl = imageUrl;
        this.productCode = productCode;
    }

    public Product(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prix=" + prix +
                ", taille='" + taille + '\'' +
                ", quantite=" + quantite +
                ", imageUrl='" + imageUrl + '\'' +
                ", productCode='" + productCode + '\'' +
                '}';
    }
}
