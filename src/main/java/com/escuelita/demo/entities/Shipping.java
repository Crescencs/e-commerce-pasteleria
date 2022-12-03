package com.escuelita.demo.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "shippings")
@Getter
@Setter
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateExit;

    @NotNull
    @NotBlank
    private String dateReceived;
    @OneToMany(mappedBy = "shipping")
    private List<Order> order;
}
