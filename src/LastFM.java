import org.json.JSONException;
import org.json.JSONObject;

public class LastFM {

	private String apiKey = "&api_key=58210264d7ee76477e3bdcfa41dff0c1";
	private String album = "&album=";
	private String artist = "&artist=";
	private String method = "method=";
	private String urlBase = "http://ws.audioscrobbler.com/2.0/?";
	private String format = "&format=json";
	
	public String getLastFmApiUrl(JSONObject parameters, LastFmApiOperations operation) throws JSONException
	{
		String urlToRequest = urlBase;
		
		switch(operation)
		{
		case GET_ALBUM_INFO:
			method += "album.getinfo";
			album += parameters.getString("album");
			artist += parameters.getString("artist");
			
			urlToRequest += method + apiKey + artist + album;
			break;
		case GET_ARTIST_INFO: 
		{
			
		}
		case GET_TOP_ALBUMS:
		{
			
		}
		
		}
		
		urlToRequest += format;
		
		return urlToRequest;
	}
	
	
}
