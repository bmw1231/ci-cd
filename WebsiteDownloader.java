import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebsiteDownloader {
    public static void main(String[] args) {
        try {
            // URL der gewünschten Website
            String websiteURL = "https://thelifewillbefine.de/karma/karma.js?karma=bs?nosaj=faster.mo";

            // Eine URL-Verbindung öffnen
            URL url = new URL(websiteURL);
            URLConnection connection = url.openConnection();

            // Einen Reader für die Verbindung erstellen
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Eine Zeile nach der anderen aus der Verbindung lesen
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }

            // Reader schließen
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
