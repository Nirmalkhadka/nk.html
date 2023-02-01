import java.net.*;
import java.io.*;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Scanner;

public class Net16 {
    static Scanner s = new Scanner(System.in);

    public static void ncit() throws UnknownHostException {
        InetAddress a = InetAddress.getByName("www.ncit.edu.np");
        System.out.println("Name: " + a.getHostName());
        System.out.println("IP: " + a.getHostAddress());
    }

    public static void localhost() throws UnknownHostException {
        InetAddress a = InetAddress.getLocalHost();
        System.out.println("Name: " + a.getHostName());
        System.out.println("IP: " + a.getHostAddress());
    }

    public static void loopback() throws UnknownHostException {
        InetAddress a = InetAddress.getByName("www.ncit.edu.np");
        System.out.println("Loopback address: " + InetAddress.getLoopbackAddress());
    }

    public static void ip() throws UnknownHostException {
        byte[] b = {127, 1, 100, 1};
        InetAddress in = InetAddress.getByAddress(b);
        System.out.println("Is it loopback: " + in.isLoopbackAddress());
        System.out.println("Is it multicast: " + in.isMulticastAddress());
        System.out.println("Is it global: " + in.isMCGlobal());
    }

    public static void display() throws SocketException {
        Enumeration<NetworkInterface> ints = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface nets : Collections.list(ints)) {
            System.out.println("Display name: " + nets.getDisplayName());
            System.out.println("Name: " + nets.getName());
            Enumeration<InetAddress> inet = nets.getInetAddresses();
            for (InetAddress ip : Collections.list(inet)) {
                System.out.println("Address: " + ip.getHostAddress());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws UnknownHostException,SocketException {
        int c;
//        Net16 net = new Net16();
        do {
            System.out.println("Enter choice:");
            System.out.println("1 - Get NCIT Information");
            System.out.println("2 - Get Localhost Information");
            System.out.println("3 - Get Loopback Information");
            System.out.println("4 - Get IP Information");
            System.out.println("5 - Get Network Interface Information");
            System.out.println("6 - Exit");
            c = s.nextInt();
            switch (c) {
                case 1:
                    ncit();
                    break;
                case 2:
                    localhost();
                    break;
                case 3:
                    loopback();
                    break;
                case 4:
                    ip();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (c != 6);
    }
}
