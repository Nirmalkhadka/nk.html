import java.net.*;
import java.io.*;
import java.io.Reader;
import java.util.Scanner;

public class Net19 {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        Socket skt = new Socket("localhost", 3200);
        DataInputStream dis=new DataInputStream(skt.getInputStream());
        DataOutputStream  dos=new DataOutputStream(skt.getOutputStream());
        while (true){
            System.out.println("enter stirng");
            String an=s.nextLine();
            if(an.equals("e")){
                break;
            }
            dos.writeUTF(an);
            String rec=(String) dis.readUTF();
            System.out.println(rec);
        }
        dos.close();
        dis.close();
        skt.close();
    }
}