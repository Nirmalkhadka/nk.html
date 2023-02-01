import java.net.*;
import java.io.*;
class Net2{
    public static void main(String [] args) throws IOException
    {
        URL url=new URL("http://nirmal.com/");
        URLConnection CON=url.openConnection();
        InputStream in=CON.getInputStream();
        int c;
        while ((c= in.read())!=-1){
            System.out.println((char) c);
        }
        in.close();
    }
}


