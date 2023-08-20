package com.example.app_final.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app_final.entity.Usuario;
import com.example.app_final.repositorio.UsuarioRepository;

@Controller
@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
/* 
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario){
        Usuario user=usuarioRepository.findUsuario(usuario.getNombre());

        if(user!=null && user.getContrasena().equals(usuario.getContrasena())){
            return ResponseEntity.ok("sesion exitosa");
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("sesion fallida");
        }
    }*/

    @PostMapping("/login1")
    public ResponseEntity<String> login1(@RequestBody Map<String, String> users){
        String nombre=users.get("nombre");
        String contrasena=users.get("contrasena");

        Usuario usuario=usuarioRepository.findByUsuario(nombre);
        if(usuario==null || usuario.getContrasena().equals(contrasena)){            
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("sesion fallida");
        }else{
            return ResponseEntity.ok("sesion exitosa");
        }
    }
}
