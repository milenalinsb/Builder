import java.math.BigDecimal;

public class main {
    public static void main (String arg[]){
        DadoClimatico dadoClimatico = DadoClimaticoBuilder.builder()
                .addValor(new BigDecimal(10))
                .get();

        System.out.println(dadoClimatico.toString());
    }
}
