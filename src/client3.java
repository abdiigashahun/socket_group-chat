import java.io.*;
import java.net.*;

public class client3 {
    private static final String SERVER_ADDRESS = "127.0.0.1"; // localhost
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true);

            // Thread to receive messages from the server
            Thread receiveThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = serverInput.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();

            // Sending messages to the server
            String message;
            while (true) {
                message = reader.readLine();
                serverOutput.println(message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

