package com.example.Unexus.models;
import jakarta.persistence.*;


@Entity
@Table(name="users")
public class UserModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String num_identity;
    private String name;
    private String address;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNum_identity() {
        return num_identity;
    }
    public void setNum_identity(String num_identity) {
        this.num_identity = num_identity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    
}
