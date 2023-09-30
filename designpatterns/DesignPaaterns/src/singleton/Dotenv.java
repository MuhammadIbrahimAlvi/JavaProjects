package singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dotenv {
    private static Map<String, String> envVariables = loadVariables();

    private static Map<String, String> loadVariables() {
        Map<String, String> variables = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(".env"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    variables.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return variables;
    }

    public static String get(String variable) {
        return envVariables.get(variable);
    }
}