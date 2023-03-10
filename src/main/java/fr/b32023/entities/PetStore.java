package fr.b32023.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String managerName;

    @OneToMany(mappedBy = "petStore", cascade = CascadeType.ALL)
    private Set<Animal> animals;
    {
        animals = new HashSet<>();
    }

    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name = "ID_PETSTORE", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID")
    )
    private Set<Product> products;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public PetStore(){
    }

    public PetStore(String name, String managerName, Address address) {
        this.name = name;
        this.managerName = managerName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
