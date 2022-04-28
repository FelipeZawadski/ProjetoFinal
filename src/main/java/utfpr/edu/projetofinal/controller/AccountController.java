package utfpr.edu.projetofinal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utfpr.edu.projetofinal.model.Account;
import utfpr.edu.projetofinal.service.AccountService;
import utfpr.edu.projetofinal.shared.GenericResponse;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    GenericResponse createAccount(@RequestBody Account account){
        accountService.save(account);
        return new GenericResponse("Registro Salvo");
    }

    @GetMapping("allAccount")
    GenericResponse getAllAccount(){
        accountService.getAllAccount();
        return new GenericResponse("Todos registros foram retornados");
    }


}
