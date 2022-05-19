package utfpr.edu.projetofinal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utfpr.edu.projetofinal.model.Account;
import utfpr.edu.projetofinal.service.AccountService;
import utfpr.edu.projetofinal.service.CrudService;


@RestController
@RequestMapping("account")
public class AccountController extends CrudController<Account, Long>{

    @Autowired
    private AccountService accountService;

    @Override
    protected CrudService<Account, Long> getService() {
        return this.accountService;
    }
}
