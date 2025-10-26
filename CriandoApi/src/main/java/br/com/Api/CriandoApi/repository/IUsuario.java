package br.com.Api.CriandoApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.Api.CriandoApi.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario,Integer>{

}
