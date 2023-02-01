//display all ip address assoiated with url
import java.net.*;
public class Net8 {
    public static void main(String [] args) throws UnknownHostException
    {
      InetAddress []yt=InetAddress.getAllByName("www.youtube.com");
      for (InetAddress add:yt){
          System.out.println(add.getHostAddress());
      }
    }
}
