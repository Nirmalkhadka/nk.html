import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Nameintxtfile {
    public static void main(String[] args) throws IOException {
        String p;
        Scanner s = new Scanner(System.in);

            FileOutputStream fos = new FileOutputStream("j.tzt");
            DataOutputStream dos = new DataOutputStream(fos);
            do{
            System.out.println("enter name");
            String ss= s.nextLine();
            dos.writeUTF(ss);
            System.out.println("enter n to exit");
            p=s.next().toLowerCase();
        }
        while (!p.startsWith("n"));
        dos.close();
        fos.close();
    }
}
