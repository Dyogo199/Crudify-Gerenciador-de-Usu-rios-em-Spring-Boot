package com.java.projetoUsuario.service;


import com.java.projetoUsuario.infra.entitys.Usuario;
import com.java.projetoUsuario.infra.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository UsuarioRepository;

    public UsuarioService (UsuarioRepository repository) {
        this.UsuarioRepository = repository;
    }

    public void salvarUsuario(Usuario Usuario) {
        UsuarioRepository.save(Usuario);
    }

    public Usuario buscarUsuario(String email) {
        return UsuarioRepository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );

    }

    public void deletarUsuarioPorEmail(String email){
        UsuarioRepository.deleteByEmail(email);
    }

    public void atualizarUsuarioPorEmail(String email, Usuario Usuario){

        Usuario UsuarioEntity = buscarUsuario(email);
        Usuario UsuarioAtualizado = Usuario.builder()
                .email(Usuario.getEmail() != null  ?
                        Usuario.getEmail() : UsuarioEntity.getEmail())
                .nome(Usuario.getNome() != null ? Usuario.getNome() :
                        UsuarioEntity.getNome())
                .id(UsuarioEntity.getId())
                .build();
        UsuarioRepository.saveAndFlush(UsuarioAtualizado);
    }

    public void atualizarUsuarioPorId(Integer id, Usuario Usuario){

        Usuario UsuarioEntity = UsuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario Não Encontrado"));
        Usuario UsuarioAtualizado = Usuario.builder()
                .email(Usuario.getEmail() != null  ?
                        Usuario.getEmail() : UsuarioEntity.getEmail())
                .nome(Usuario.getNome() != null ? Usuario.getNome() :
                        UsuarioEntity.getNome())
                .id(UsuarioEntity.getId())
                .build();
        UsuarioRepository.saveAndFlush(UsuarioAtualizado);
    }

}
