import java.io.*;
import java.net.*;

public class Net17Multitherading extends Thread {
    Socket skt;

    public Net17Multitherading(Socket skt) {
        this.skt = skt;
    }

    public void run() {
        try {
            System.out.println("Connected: " + this.skt.getPort());
            DataInputStream dis = new DataInputStream(this.skt.getInputStream());
            DataOutputStream dos = new DataOutputStream(this.skt.getOutputStream());

            // Add logic here

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

    public class ServerMulthreading {
        public static void main(String[] args) {
            try {

                ServerSocket ss = new ServerSocket(3200);
                System.out.println("Running");
                while (true) {
                    Socket skt = ss.accept();
                    Net17Multitherading nk = new Net17Multitherading(skt);
                    nk.start();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
