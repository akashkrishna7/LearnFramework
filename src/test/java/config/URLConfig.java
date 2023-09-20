package config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;

public class URLConfig {
    private static final Properties properties = new Properties();

    static {
        try {
            // Load the properties file
            InputStream inputStream = URLConfig.class.getClassLoader().getResourceAsStream("environment.properties");

            // Check if the file was successfully loaded
            if (inputStream != null) {
                properties.load(inputStream);
                inputStream.close();
            } else {
                throw new FileNotFoundException("environment.properties not found in the classpath");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getURLForEnvironment(String environment) {
        // Get the URL based on the specified environment
        return properties.getProperty(environment + ".url");
    }
}

