import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {
    public Moedas buscaMoeda(String coin){
        URI valor = URI.create("https://v6.exchangerate-api.com/v6/e2c6531af81403fb0b641a25/latest/"+ coin);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(valor)
                .build();

        HttpResponse<String> response = null;
        try {
            response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Moedas.class);
    }

    public double converter(double valor, String moeda2, String moedaOrigem){
        Moedas taxas = buscaMoeda(moedaOrigem);
        double resultado;
        double valor1 = taxas.conversion_rates().get(moeda2);
        resultado = valor * valor1;

        return resultado;
    }

}
