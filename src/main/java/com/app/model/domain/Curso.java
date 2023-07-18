package com.app.model.domain;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.AUTO;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
// @NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @NonNull // para agregar al constructor con lombok
    @NotBlank
    private String titulo;

    @NonNull
    @NotNull
    @Positive
    private Float precio;

    public Curso(String titulo, Float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }
}
