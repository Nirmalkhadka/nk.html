import java.io.*;

public class Copymp3file {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("create.mp3");
            FileOutputStream fos = new FileOutputStream("extract.mp3");
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
