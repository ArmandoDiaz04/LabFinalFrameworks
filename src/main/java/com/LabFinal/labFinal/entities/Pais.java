package com.LabFinal.labFinal.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "paises")
public class Pais implements Serializable {
    @Id
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "pais")
    private String pais;
    @Column(name = "Region")
    private String region;
    @Column(name = "nivel")
    private String nivel;
    }