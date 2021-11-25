package com.vermaji.hangup.models;

import javax.persistence.*;

@Entity
@Table(name = "postImages")
public class PostMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
