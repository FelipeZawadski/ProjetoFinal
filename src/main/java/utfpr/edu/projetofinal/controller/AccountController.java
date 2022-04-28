package utfpr.edu.projetofinal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utfpr.edu.projetofinal.model.Account;
import utfpr.edu.projetofinal.service.AccountService;
import utfpr.edu.projetofinal.shared.GenericResponse;


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

    @GetMapping
    GenericResponse findAllAccount(){
        return new GenericResponse("Registros retornados: " + accountService.listAll());
    }

    @DeleteMapping("/{id}")
    GenericResponse deleteAccount(@PathVariable long id){
        accountService.deleteAccount(id);
        return new GenericResponse("Registro Excluido");
    }

    @PutMapping("/{id}")
    GenericResponse replaceAccount(@RequestBody Account acount, @PathVariable long id){
        accountService.replaceAccount(acount,id);
        return new GenericResponse("Registro Atualizado");
    }
}
