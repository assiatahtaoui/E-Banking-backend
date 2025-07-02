package ma.enset.ebankback.entities;

import jakarta.persistence.*;
import jdk.dynalink.Operation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ma.enset.ebankback.enums.OperationType;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operation;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType Type;
     @ManyToOne
    private BankAccount bankAccount;
     private String description;

}
