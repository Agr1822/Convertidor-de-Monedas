import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarAPI {
  public  Monedas buscarMoneda(String monedaOrigen, String monedaDestino) {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a82f537d13b867fdf3180bd9/pair/" + monedaOrigen+"/"+monedaDestino);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            try {
                HttpResponse<String> reponse = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(reponse.body(), Monedas.class);
            }
            catch (Exception e) {
                throw new RuntimeException("No se encontro la Moneda");
            }
        }
    }

