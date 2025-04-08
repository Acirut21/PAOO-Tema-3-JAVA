import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper {
    private static WebHelper instance;
    private String webContent;
    private boolean isLoaded = false;
    private final String URL_STRING = "https://www.ucv.ro"; // URL hardcodat

    private WebHelper() {
        // Constructor privat pentru Singleton
    }

    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    private void loadWebContent() {
        if (!isLoaded) {
            StringBuilder content = new StringBuilder();
            try {
                URL url = new URL(URL_STRING);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                }

                webContent = content.toString();
                isLoaded = true;
            } catch (Exception e) {
                webContent = "Eroare la incarcarea paginii!";
                e.printStackTrace();
            }
        }
    }

    public String getWebSiteContent() {
        if (!isLoaded) {
            loadWebContent();
        }
        return webContent;
    }
}
