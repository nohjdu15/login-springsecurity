package com.registros.usuarios.Servicio;

import com.registros.usuarios.dto.UsuarioRegistroDTO;
import com.registros.usuarios.modelo.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioServicio extends UserDetailsService {
    public Usuario guardar(UsuarioRegistroDTO registroDTO);
    public List<Usuario> listarUsuarios();
}
