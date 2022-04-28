package utfpr.edu.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utfpr.edu.projetofinal.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
