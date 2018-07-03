import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class VkOut {
    public static void VkSendId(String message, String id) throws URISyntaxException, IOException {
        URIBuilder uriBuild = new URIBuilder();
        uriBuild
                .setScheme("https")
                .setHost("api.vk.com")
                .setPath("/method/messages.send")
                .setParameter("access_token", Solution.token)
                .setParameter("user_id", "" + id)
                .setParameter("message", message);

        URI uri = null;
        uri = uriBuild.build();

        System.out.println(uri);

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(uri);

        HttpResponse response = client.execute(request);
        Integer status = response.getStatusLine().getStatusCode();
    }
}
