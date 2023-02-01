import java.net.*;
import java.util.*;

public class Net10 {
    public static void main(String [] args) throws SocketException {

        Enumeration<NetworkInterface> ints = NetworkInterface.getNetworkInterfaces();
        for(NetworkInterface nets : Collections.list(ints)){

            System.out.println("display name="+nets.getDisplayName());
            System.out.println("name="+nets.getName());
            Enumeration<InetAddress>inet=nets.getInetAddresses();
            for (InetAddress ip : Collections.list(inet)){
                System.out.println("address="+ip.getHostAddress());
            }
        }
    }
}
