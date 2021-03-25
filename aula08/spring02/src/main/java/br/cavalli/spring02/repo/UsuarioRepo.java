package br.cavalli.spring02.repo;

import org.springframework.data.repository.CrudRepository;

import br.cavalli.spring02.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario,Integer> {
    
    public Usuario findByEmailAndSenha(String email, String senha);

}
