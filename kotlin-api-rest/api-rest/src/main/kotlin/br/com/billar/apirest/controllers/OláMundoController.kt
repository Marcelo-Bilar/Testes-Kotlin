package br.com.billar.apirest.controllers

import br.com.billar.apirest.Entities.Usuario
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/olamundo")
class OláMundoController {

    @GetMapping
    fun tratarOlaMundo () : Usuario {
        return Usuario("Usuario Teste","teste@teste.com","123456")
    }
}