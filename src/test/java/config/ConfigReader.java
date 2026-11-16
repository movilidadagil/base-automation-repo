package config;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Properties;

public class ConfigReader {
    public static Properties props = new Properties();

    public static void load(){

        try (InputStream is = ConfigReader.class.getClassLoader()
                .getResourceAsStream("config.properties");
             Reader reader = new InputStreamReader(
                     Objects.requireNonNull(is, "config.properties bulunamadı"),
                     StandardCharsets.UTF_8)) {
            props.load(reader);
        }catch (IOException e){
            System.out.printf("exception is thrown");
        }
    }
}
