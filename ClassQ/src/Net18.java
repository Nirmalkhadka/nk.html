import java.net.*;
import java.io.*;
import java.io.Reader;
import java.util.Scanner;

public class Net18 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 3200);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        Scanner sc = new Scanner(System.in);
        String line = null;
        while (!"exit".equalsIgnoreCase(line)) {
            line = sc.nextLine();
            out.println(line);
            out.flush();
            System.out.println("server replied=" + in.readLine());
        }
        sc.close();
    }
}