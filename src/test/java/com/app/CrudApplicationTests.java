package com.app;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.model.domain.Curso;
import com.app.repository.CursoRepository;

@SpringBootTest
class CrudApplicationTests {

	@Mock
	CursoRepository cursoRepository;

	@Test
	public void testFindAllCurses() {
		Curso curso1 = new Curso("Spring Boot with H2", 150F);
		Curso curso2 = new Curso("Spring Boot with H2", 100F);

		List<Curso> cursos = Arrays.asList(curso1, curso2);

		when(cursoRepository.findAll()).thenReturn(cursos);
	}

}
