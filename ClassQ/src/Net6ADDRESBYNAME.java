//to get host address by its name
import java.net.*;

public class Net6 {
    public static void main(String [] args) throws UnknownHostException
    {
        InetAddress ad=InetAddress.getByName("www.pu.edu.np");
        System.out.println(ad.getHostName());
        System.out.println("ip address="+ad.getHostAddress());
    }
}
