import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ContentServer {
    public static void main(String[] args) {

        try{
            System.out. println("Waiting for clients requests");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            //print
            System.out.println("Connected");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
