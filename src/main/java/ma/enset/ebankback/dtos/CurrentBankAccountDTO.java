package ma.enset.ebankback.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.ebankback.entities.AccountOperation;
import ma.enset.ebankback.entities.Customer;
import ma.enset.ebankback.enums.AccountStatuts;

import java.util.Date;
import java.util.List;

@Data
public class SavingBankAccountDTO {

    private String id;
    private double balance;
    private Date createDat;
    private AccountStatuts statuts;
    private CustomerDTO customerDTO;
    private double interestRate;

}
