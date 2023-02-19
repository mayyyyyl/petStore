package fr.b32023.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;

    private String label;

    private ProdType type;

    private Double price;

    @ManyToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private Set<PetStore> petsStores;

    public Product() {
    }

    public Product(String code, String label, ProdType type, Double price, Set<PetStore> petsStores) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.price = price;
        this.petsStores = petsStores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ProdType getType() {
        return type;
    }

    public void setType(ProdType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<PetStore> getPetsStores() {
        return petsStores;
    }

    public void setPetsStores(Set<PetStore> petsStores) {
        this.petsStores = petsStores;
    }
}
