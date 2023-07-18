package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.model.domain.Curso;

@RepositoryRestResource(path = "cursos", collectionResourceRel = "cursos") // crea servicios a partir del repositorio
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
