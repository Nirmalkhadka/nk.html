import java.io.*;

public class Copymp3usingbuffered {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("create.mp3");
            FileOutputStream fos = new FileOutputStream("extract.mp3");
            BufferedInputStream bin=new BufferedInputStream(fis);
            BufferedOutputStream bou=new BufferedOutputStream(fos);
            int data;
            while ((data = bin.read()) != -1) {
                bou.write(data);
            }
            bou.close();
            bin.close();
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
