package utfpr.edu.projetofinal.secutiry;

import lombok.Data;
import lombok.NoArgsConstructor;
import utfpr.edu.projetofinal.model.User;

@Data
@NoArgsConstructor
public class UserDTO {

    private long id;
    private String username;
    private String email;

    public UserDTO(User user){
        this.id = user.getId();
        this.email = user.getEmail();
        this.username = user.getUsername();
    }
}
