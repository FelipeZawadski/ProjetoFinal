package utfpr.edu.projetofinal.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;


    private String username;
    private String email;
    private String password;


}
