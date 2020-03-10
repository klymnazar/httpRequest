import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AnotherThread implements Runnable {

    private HttpRequest request;

    public AnotherThread(HttpRequest request) {
        this.request = request;
    }

    @Override
    public void run() {

        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            System.out.println(" - " + response.body());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" - " + request + " " + Thread.currentThread().getName());

    }
}
