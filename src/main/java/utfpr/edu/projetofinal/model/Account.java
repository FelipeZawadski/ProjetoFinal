package utfpr.edu.projetofinal.model;


import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private long number;
    private String agency;
    private String bank;

    public static final String CONTA_CORRENTE = "Conta Corrente";
    public static final String CONTA_POUPANCA = "Conta Poupança";
    public static final String CONTA_CARTAO = "Conta cartão";
}
