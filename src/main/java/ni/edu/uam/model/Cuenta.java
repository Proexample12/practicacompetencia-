package ni.edu.uam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cuenta {
    private BigInteger numero;
    private String titular;
    private BigDecimal saldo;
}
