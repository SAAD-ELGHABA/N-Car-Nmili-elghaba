import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;;

public class Server {
    private static final int PORT = 8000;
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create( new InetSocketAddress(PORT),0);
        server.createContext("/", "Welcome back");
        server.createContext("/api/test", "hello world");

        server.start();
         System.out.println("Server started on port " + PORT);
        System.out.println("Visit: http://localhost:" + PORT);
        System.out.println("Test API: http://localhost:" + PORT + "/api/test");
    }
}