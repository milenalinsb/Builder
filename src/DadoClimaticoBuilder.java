import java.math.BigDecimal;

public class DadoClimaticoBuilder {
    private DadoClimatico dadoClimatico;

    public static DadoClimaticoBuilder builder() {
        return new DadoClimaticoBuilder();
    }
    public DadoClimaticoBuilder() {
        this.dadoClimatico = new DadoClimatico();
    }

    public DadoClimaticoBuilder addValor (BigDecimal valor){
        dadoClimatico.setValor(valor);
        return this;
    }

    public DadoClimatico get() {
        return this.dadoClimatico;
    }
}
