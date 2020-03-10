import java.net.http.HttpRequest;
import java.util.Set;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        HTTPRequests httpRequests = new HTTPRequests();
        Set<HttpRequest> requests = httpRequests.httpRequests();

        for (HttpRequest request : requests) {
            AnotherThread anotherThread = new AnotherThread(request);
            Thread newThread = new Thread(anotherThread);
            newThread.start();
        }
    }
}