package config;

public class EnvironmentConfig {
    private static String baseURL;

    // Set the base URL for the "dev" environment
    public static void setDevEnvironment() {
        baseURL = URLConfig.getURLForEnvironment("dev");
    }

    // Set the base URL for the "prod" environment
    public static void setProdEnvironment() {
        baseURL = URLConfig.getURLForEnvironment("prod");
    }

    public static String getBaseURL() {
        return baseURL;
    }
}
