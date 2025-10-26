package br.com.Api.CriandoApi.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

@Entity
@Table(name="usuario")

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	
	@NotBlank(message = "O nome é Obrigatorio!")
	@Size(min = 3 , message = "O nome deve ter no minimo 3 caracteres!")
	@Column(name="nome",length = 200,nullable = false)
	private String nome;
	
	@Email(message = "Insira um email valido!")
	@NotBlank(message = "O email é Obrigatorio!")
	@Column(name="email",length = 50,nullable = false)
	private String email;
	
	@NotBlank(message = "A senha é Obrigatorio!")
	@Column(name="senha",columnDefinition="TEXT",nullable = false)
	private String senha;
	
	@NotBlank(message = "O telefone é Obrigatorio!")
	@Column(name="telefone",length = 15,nullable = false)
	private String telefone;
}
