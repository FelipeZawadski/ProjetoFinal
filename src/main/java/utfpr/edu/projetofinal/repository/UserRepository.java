package utfpr.edu.projetofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utfpr.edu.projetofinal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
