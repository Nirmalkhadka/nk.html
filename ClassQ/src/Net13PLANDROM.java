import java.net.*;
import java.io.*;

public class Net13 {

    public static void main(String[] args) throws IOException {

        ServerSocket s = new ServerSocket(5000);
        System.out.println("Server is Running at port 5000");
//            Socket skt = serverSocket.accept();
        Socket ss = s.accept();
        System.out.println("Client is Connect using port" + ss.getPort());
        DataInputStream dis = new DataInputStream(ss.getInputStream());
        DataOutputStream dos = new DataOutputStream(ss.getOutputStream());
        String text = (String) dis.readUTF();
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev = rev + text.charAt(i);
        }
        if (rev.toLowerCase().equals(text)) {
            System.out.println("it is plandrom");
        } else {
            System.out.println("not");
        }
        //dos.writeUTF(reply);
        dos.close();
        dis.close();
        s.close();
        ss.close();
    }
}