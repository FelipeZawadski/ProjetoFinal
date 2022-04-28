package utfpr.edu.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utfpr.edu.projetofinal.model.User;
import utfpr.edu.projetofinal.service.UserService;
import utfpr.edu.projetofinal.shared.GenericResponse;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    GenericResponse createUser(@RequestBody User user){
        userService.save(user);
        return new GenericResponse("Registro Salvo");
    }

    @DeleteMapping("/{id}")
    GenericResponse deleteUser(@PathVariable long id){
        userService.deleteUser(id);
        return new GenericResponse("Registro Excluido");
    }

    @GetMapping
    GenericResponse findAllUser(){
         return new GenericResponse("Registros retornados: " + userService.listAll());
    }

    @PutMapping("/{id}")
    GenericResponse replaceUser(@RequestBody User user, @PathVariable long id){
        userService.replaceUser(user,id);
        return new GenericResponse("Registro Atualizado");
    }
}
