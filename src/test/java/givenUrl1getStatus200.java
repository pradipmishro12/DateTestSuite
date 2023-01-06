import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class givenUrl1getStatus200 {


    final static String url = "https://helloacm.com/api/unix-timestamp-converter/?cached&s=1451613802";

    @Test
    public void givenUrl1getStatus200()
            throws ClientProtocolException, IOException {

        // Given
        HttpUriRequest request = new HttpGet(url);

        // When
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        // Then
        Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), 200);
        System.out.println(httpResponse);
    }

}
