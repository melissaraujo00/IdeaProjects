package bloqueStatic;

public class ConfigurationDB {
    static final String URL;
    static final String USER;

    static {
        URL = "";
        USER = "admin";
        System.out.println("Configuracion cargada...");
    }

    static void main(String[] args) {
        System.out.println(URL);
        System.out.println(USER);
    }
}
