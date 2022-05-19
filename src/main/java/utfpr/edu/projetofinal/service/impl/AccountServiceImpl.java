package utfpr.edu.projetofinal.service.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import utfpr.edu.projetofinal.model.Account;
import utfpr.edu.projetofinal.repository.AccountRepository;
import utfpr.edu.projetofinal.service.AccountService;

@Service
public class AccountServiceImpl extends CrudServiceImpl<Account, Long> implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    protected JpaRepository<Account, Long> getRepository() {
        return this.accountRepository;
    }
}
