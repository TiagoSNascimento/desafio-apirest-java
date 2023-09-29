package me.dio.projeto.apirest.database;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.projeto.apirest.entidade.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long> {
    
}
