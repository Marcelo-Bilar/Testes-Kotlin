package br.com.billar.apirest.controllers

import br.com.billar.apirest.dtos.LoginDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/login")
class LoginController {
    @PostMapping
    fun executarLogin(@RequestBody dto : LoginDTO) : String{
        if(dto != null && !dto.login.isNullOrBlank() && !dto.login.isNullOrEmpty()
            && !dto.Senha.isNullOrEmpty() && !dto.Senha.isNullOrBlank()
            && dto.login == "admin@adim.com" && dto.Senha == "A1234"){
            return "Usuário Autenticado"
        }
            return "Parametros de entrada inválidos"
        }
    }