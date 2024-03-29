package br.com.treinamento.twgerenciadortarefa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinamento.twgerenciadortarefa.modelos.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	Usuario findByEmail(String email);

}
