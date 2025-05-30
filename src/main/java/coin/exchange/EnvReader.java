package coin.exchange;
import io.github.cdimascio.dotenv.Dotenv;

public class EnvReader {
   private final Dotenv dotenv;

   public EnvReader() {
       this.dotenv = Dotenv.load();
   }

   public String getEnv(String key) {
       return dotenv.get(key);
   }
}
