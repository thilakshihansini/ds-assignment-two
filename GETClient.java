import java.net.Socket;

public class GETClient {
    public static void main(String[] args) {

        try{
            System.out.println("Client sterted");
            Socket soc = new Socket("127.0.0.1", 9806);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
