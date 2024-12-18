package src.main.java.ws;

import jakarta.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Server started at " + url);
    }
}
