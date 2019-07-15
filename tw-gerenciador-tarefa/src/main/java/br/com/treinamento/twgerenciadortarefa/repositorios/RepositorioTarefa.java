package br.com.treinamento.twgerenciadortarefa.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.treinamento.twgerenciadortarefa.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{
	
	@Query("SELECT t FROM Tarefa t WHERE t.usuario.email = :emailUsuario")
	List<Tarefa> carregarTarefasPorUsuarios(@Param("emailUsuario") String email);
}
