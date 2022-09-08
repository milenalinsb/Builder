import java.math.BigDecimal;

public class DadoClimatico {
    BigDecimal valor;

    public DadoClimatico() {
    }

    @Override
    public String toString() {
        return "DadoClimatico{" +
                "valor=" + valor +
                '}';
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
