import java.io.*;
import java.net.*;
class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(serverAddress, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello from client");

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String response = reader.readLine();
            System.out.println("Server response: " + response);
        } catch (IOException ex) {
            System.err.println("Client exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
