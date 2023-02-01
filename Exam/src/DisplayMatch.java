import java.io.*;

public class DisplayMatch {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("nirmal.txt");
        DataInputStream dis = new DataInputStream(fis);
        while (dis.available() > 0) {
            String name = dis.readUTF();
            if (name.toLowerCase().equals("nk")) {
                System.out.println("Name: " + name);
            }
        }
        dis.close();
        fis.close();
    }
}
