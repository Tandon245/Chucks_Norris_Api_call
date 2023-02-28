import java.net.HttpURLConnection;
import java.net.URL;
public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = conn.getInputStream().read()) != -1) {
                sb.append((char) cp);
            }

            String output = sb.toString();
            System.out.println(output);

            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}