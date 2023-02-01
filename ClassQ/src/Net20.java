import javax.xml.crypto.Data;
import java.net.*;
public class Net20 {
    public static void main(String [] args)throws Exception{
        DatagramSocket socket=new DatagramSocket(9000);
        byte[]rec=new byte[1024];
        byte[]send=new byte[1024];
        while (true){
            DatagramPacket recpack=new DatagramPacket(rec,rec.length);
            socket.receive(recpack);
            String sem=new String(recpack.getData());
            System.out.println("recived="+sem);
            String str="hello client";
            send= str.getBytes();
            InetAddress cl=recpack.getAddress();
            int cli=recpack.getPort();
            DatagramPacket sendp=new DatagramPacket(send,send.length,cl,cli);
            socket.send(sendp);
        }
    }
}
