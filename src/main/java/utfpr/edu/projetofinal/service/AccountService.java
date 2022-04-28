package utfpr.edu.projetofinal.service;

import org.springframework.stereotype.Service;
import utfpr.edu.projetofinal.model.Account;
import utfpr.edu.projetofinal.model.User;
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
        accountRepository.deleteById(id);
    }

    public List<Account> listAll(){
        return accountRepository.findAll();
    }

    public Account replaceAccount(Account account, Long id){
        Account accountReplace = accountRepository.findById(id).get();
        accountReplace.setAgency(account.getAgency());
        accountReplace.setBank(account.getBank());
        accountReplace.setNumber(account.getNumber());
        accountReplace.setUser(account.getUser());

        return accountRepository.save(accountReplace);
    }
}
