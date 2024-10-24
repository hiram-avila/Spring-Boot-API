package com.example.demo.controllers;

import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;      

    // Obtener todos los usuarios
    @GetMapping
    public List<String> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    // Agregar un nuevo usuario
    @PostMapping
    public String addUsuario(@RequestBody String usuario) {
        usuarioService.addUsuario(usuario);
        return "Usuario agregado!";
    }

    // Obtener un usuario por ID
    @GetMapping("/{id}")
    public String getUsuario(@PathVariable int id) {
        String usuario = usuarioService.getUsuario(id);
        return (usuario != null) ? usuario : "Usuario no encontrado";
    }

    // Actualizar un usuario por ID
    @PutMapping("/{id}")
    public String updateUsuario(@PathVariable int id, @RequestBody String usuario) {
        boolean updated = usuarioService.updateUsuario(id, usuario);
        return updated ? "Usuario actualizado!" : "Usuario no encontrado";
    }

    // Eliminar un usuario por ID
    @DeleteMapping("/{id}")
    public String deleteUsuario(@PathVariable int id) {
        boolean deleted = usuarioService.deleteUsuario(id);
        return deleted ? "Usuario eliminado!" : "Usuario no encontrado";
    }
}
