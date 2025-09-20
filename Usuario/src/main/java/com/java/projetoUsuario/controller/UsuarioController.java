package com.java.projetoUsuario.controller;

import com.java.projetoUsuario.infra.entitys.Usuario;
import com.java.projetoUsuario.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
     private final UsuarioService userService;

     @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario){
         userService.salvarUsuario(usuario);
         return ResponseEntity.ok().build();
     }

     @GetMapping
    public  ResponseEntity<Usuario> buscarUserPorEmail(@RequestParam String email){
         return ResponseEntity.ok(userService.buscarUsuario(email));
     }
     @DeleteMapping
    public  ResponseEntity<Void> deletarUsuarioPoremail(@RequestParam String email){
         userService.deletarUsuarioPorEmail(email);
         return ResponseEntity.ok().build();
     }
     @PutMapping
    public ResponseEntity<Void> atualizarUsuarioPorId (@RequestParam Integer Id,
                                                       @RequestBody Usuario usuario){

         userService.atualizarUsuarioPorId(Id, usuario);
         return ResponseEntity.ok().build();
     }

}
