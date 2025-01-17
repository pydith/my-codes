import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatbotClient {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String userMessage;

            while (true) {
                System.out.print("You: ");
                userMessage = reader.readLine();
                if (userMessage.equalsIgnoreCase("exit")) {
                    break;
                }

                String response = sendMessageToChatbot(userMessage);
                System.out.println("Bot: " + response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String sendMessageToChatbot(String message) throws Exception {
        URL url = new URL("http://127.0.0.1:5000/chat");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        String jsonInputString = "{\"message\": \"" + message + "\"}";

        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
        StringBuilder response = new StringBuilder();
        String responseLine;

        while ((responseLine = br.readLine()) != null) {
            response.append(responseLine.trim());
        }

        return response.toString();
    }
}
