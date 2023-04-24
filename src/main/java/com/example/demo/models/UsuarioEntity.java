package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection= "USUARIO")
public class UsuarioEntity {
    @Id
    private Long id;

    private String nombre;

    private String email;

    private Integer prioridad;
}
