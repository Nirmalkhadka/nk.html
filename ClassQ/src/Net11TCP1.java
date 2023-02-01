//tcp server
import java.net.*;
import java.io.*;
public class Net11 {
    public static void main(String [] args)throws IOException{
        ServerSocket SS=new ServerSocket(4400);
        System.out.println("server wating for clinet");
        Socket s=SS.accept();
        System.out.println("connected");
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String msg=dis.readUTF();
        System.out.println("client says="+msg);
        dis.close();
        s.close();
        SS.close();
    }
}
