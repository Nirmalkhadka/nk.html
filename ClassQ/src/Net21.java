import java.net.*;

public class Net21 {
    public static void main(String[] args) throws Exception {
        DatagramSocket clientSocket = new DatagramSocket();
        byte[] send = new byte[1024];
        byte[] receive = new byte[1024];
        String stringSend = "hello sender";
        send = stringSend.getBytes();
        InetAddress IPAddress = InetAddress.getLocalHost();
        DatagramPacket sendPacket = new DatagramPacket(send, send.length, IPAddress, 9000);
        clientSocket.send(sendPacket);
        DatagramPacket receivePacket = new DatagramPacket(receive, receive.length);
        clientSocket.receive(receivePacket);
        receive = receivePacket.getData();
        String stringRec = new String(receive);
        System.out.println("from server: " + stringRec);
        clientSocket.close();
    }
}
