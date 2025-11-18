import java.util.Map;

public record Moedas(
        String result,
        String base_code,
        Map<String, Double>conversion_rates
) {
    public record ConversionRates(
            Double USD,
            Double BRL,
            Double EUR,
            Double GBP,
            Double JPY
            // adicione outras moedas conforme necessidade
    ) {}
}