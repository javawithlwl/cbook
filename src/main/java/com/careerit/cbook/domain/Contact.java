package com.careerit.cbook.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "contact")
@Getter
@Setter
public class Contact {
    @Id
    private UUID id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile",nullable = false)
    private String mobile;
    @Column(name = "dob")
    private LocalDate dob;
    @Column(name = "deleted")
    private boolean deleted;

    @PrePersist
    public void onSave(){
        if(id == null){
            id = UUID.randomUUID();
        }
    }

}
