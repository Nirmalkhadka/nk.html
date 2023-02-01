import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Net14 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Enter a String");
            String text =  scn.next();
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(text);
//            DataInputStream dis = new DataInputStream(socket.getInputStream());
//            String result = dis.readUTF();
//            System.out.println(result);
//            dis.close();
            dos.close();
            socket.close();
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}