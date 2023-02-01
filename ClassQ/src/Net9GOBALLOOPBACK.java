//to check if address is global or multi-address
import java.net.*;
public class Net9 {
    public static void main(String [] args)throws UnknownHostException{
       byte[]b={127,0,0,1};
       InetAddress in=InetAddress.getByAddress(b);
        System.out.println("is it loop back="+in.isLoopbackAddress());
        System.out.println("is it multicast="+in.isMulticastAddress());
        System.out.println("loop back address="+InetAddress.getLoopbackAddress());
        System.out.println("is it global="+in.isMCGlobal());
    }
}
