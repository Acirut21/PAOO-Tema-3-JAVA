import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Config {
    private static Config instance;
    private String color;
    private int weight;
    private boolean isLoaded = false;

    private Config() {
        // Constructor privat pentru Singleton
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private void loadConfig() {
        if (!isLoaded) {
            try (BufferedReader reader = new BufferedReader(new FileReader("config.json"))) {
                StringBuilder jsonContent = new StringBuilder();
                String line;

                while ((line = reader.readLine()) != null) {
                    jsonContent.append(line.trim());
                }

                parseJson(jsonContent.toString());
                isLoaded = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void parseJson(String json) {
        json = json.replaceAll("[{}\"]", ""); // Eliminam acolade și ghilimele
        String[] keyValuePairs = json.split(",");

        for (String pair : keyValuePairs) {
            String[] entry = pair.split(":");
            String key = entry[0].trim();
            String value = entry[1].trim();

            if (key.equals("color")) {
                this.color = value;
            } else if (key.equals("weight")) {
                this.weight = Integer.parseInt(value);
            }
        }
    }

    public String getColor() {
        if (!isLoaded) {
            loadConfig();
        }
        return color;
    }

    public int getWeight() {
        if (!isLoaded) {
            loadConfig();
        }
        return weight;
    }
}