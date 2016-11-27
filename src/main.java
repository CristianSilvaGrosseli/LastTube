import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.json.JSONObject;

public class main {

	public static void main(String[] args) throws ClientProtocolException, IOException, JSONException {
		// TODO Auto-generated method stub
		JSONObject teste = new JSONObject();
		
		teste.put("album", "Believe");
		teste.put("artist", "Cher");
		
		LastFM urlteste = new LastFM();
		
		Rest rest = new Rest();
		JSONObject json = rest.getResponse(urlteste.getLastFmApiUrl(teste, LastFmApiOperations.GET_ALBUM_INFO));
		System.out.println(json);
	}
}
