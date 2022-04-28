package utfpr.edu.projetofinal.service;

import org.springframework.stereotype.Service;
import utfpr.edu.projetofinal.model.Account;
import utfpr.edu.projetofinal.repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public Account save(Account account){
        return accountRepository.save(account);
    }

    public List<Account> getAllAccount(){
        return accountRepository.findAll();
    }

    public void deleteAccount(Long id){

    }
}
