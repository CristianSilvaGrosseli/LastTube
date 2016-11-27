import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import org.json.JSONTokener;
import org.json.JSONArray;

import java.util.Iterator;

public class Rest {
	
	/*private String apiKey = "58210264d7ee76477e3bdcfa41dff0c1";
	private String album = "Believe";
	private String artist = "Cher";
	
	private String urlBase = "http://ws.audioscrobbler.com/2.0/?method=album.getinfo&api_key=" + apiKey + "&artist=" + artist + "&album=" + album + "&format=json";
*/			
	public JSONObject getResponse(String url) throws ClientProtocolException, IOException, JSONException
	{
		HttpClient client = new DefaultHttpClient();
    	HttpGet request = new HttpGet(url);
    	HttpResponse response = client.execute(request);
    	BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        String line = "";
        String content = "";
       
        while ((line = rd.readLine()) != null) 
        {
          content += line;
        }
        
        JSONObject json = (JSONObject) new JSONTokener(content).nextValue();
        return json;
        //System.out.println(json);
       // JSONObject teste = json.getJSONObject("album");
        //System.out.println(teste.toString());
	}
}
