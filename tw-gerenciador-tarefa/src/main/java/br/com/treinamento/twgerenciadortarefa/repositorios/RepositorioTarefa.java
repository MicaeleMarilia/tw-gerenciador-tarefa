package br.com.treinamento.twgerenciadortarefa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamento.twgerenciadortarefa.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long>{

}
