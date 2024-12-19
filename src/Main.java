import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerChat serverChat = new ServerChat();
        serverChat.serverReceive();
    }
}