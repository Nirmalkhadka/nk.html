//get localhost name and address
import java.net.*;
class Net7
{
    public static void main(String [] args) throws UnknownHostException
    {
        InetAddress a=InetAddress.getLocalHost();
        System.out.println("name="+a.getHostName());
        System.out.println("ip="+a.getHostAddress());
    }
}
