package ma.enset.ebankback.mappers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CustomerDTO {
        private Long id;
        private String name;
        private String email;
}
