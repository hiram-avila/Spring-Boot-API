package com.example.demo.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<String> usuarios = new ArrayList<>();

    // Obtener todos los usuarios
    public List<String> getUsuarios() {
        return usuarios;
    }

    // Agregar un nuevo usuario
    public void addUsuario(String usuario) {
        usuarios.add(usuario);
    }

    // Obtener un usuario por ID
    public String getUsuario(int id) {
        if (id >= 0 && id < usuarios.size()) {
            return usuarios.get(id);
        }
        return null;
    }

    // Actualizar un usuario por ID
    public boolean updateUsuario(int id, String usuario) {
        if (id >= 0 && id < usuarios.size()) {
            usuarios.set(id, usuario);
            return true;
        }
        return false;
    }

    // Eliminar un usuario por ID
    public boolean deleteUsuario(int id) {
        if (id >= 0 && id < usuarios.size()) {
            usuarios.remove(id);
            return true;
        }
        return false;
    }
}
