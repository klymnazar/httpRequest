import java.net.URI;
import java.net.http.HttpRequest;
import java.util.*;

public class HTTPRequests {

    public Set<HttpRequest> httpRequests() {

        HttpRequest httpRequest1 = HttpRequest.newBuilder()
                .uri(URI.create("http://webcode.me"))
                .build();

        HttpRequest httpRequest2 = HttpRequest.newBuilder()
                .uri(URI.create("https://uk.wikipedia.org/wiki/Головна_сторінка"))
                .build();

        HttpRequest httpRequest3 = HttpRequest.newBuilder()
                .uri(URI.create("https://javarush.ru/groups/posts/2078-threadom-java-ne-isportishjh--chastjh-v---executor-threadpool-fork-join-pool"))
                .build();

        HttpRequest httpRequest4 = HttpRequest.newBuilder()
                .uri(URI.create("https://stackoverflow.com/questions/1322335/what-is-the-best-java-library-to-use-for-http-post-get-etc"))
                .build();

        HttpRequest httpRequest5 = HttpRequest.newBuilder()
                .uri(URI.create("https://python-scripts.com/requests"))
                .build();

        Set<HttpRequest> httpRequests = new LinkedHashSet<>();
        httpRequests.add(httpRequest1);
        httpRequests.add(httpRequest2);
        httpRequests.add(httpRequest3);
        httpRequests.add(httpRequest4);
        httpRequests.add(httpRequest5);

        return httpRequests;

    }

}
