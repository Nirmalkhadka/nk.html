import java.net.*;
import java.io.*;

public class Net12 {
    public static void main(String [] args)throws IOException{
        Socket s=new Socket("localhost",4400);
        String msg=("nirmal");
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        dos.writeUTF(msg);
        dos.close();
        s.close();
    }
}
