package utfpr.edu.projetofinal.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import utfpr.edu.projetofinal.model.User;
import utfpr.edu.projetofinal.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public User save (User user){
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public List<User> listAll(){
        return userRepository.findAll();
    }

    public User replaceUser(User user, Long id){
        User userReplace = userRepository.findById(id).get();
        userReplace.setUsername(user.getUsername());
        userReplace.setEmail(user.getEmail());
        userReplace.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        return userRepository.save(userReplace);
    }


}
