import java.io.IOException;
import java.io.InputStream;
import java.net.*;
public class Net3 {
    public static void main(String [] args) throws IOException
    {
        URL url=new URL("https://www.facebook.com/");
        HttpURLConnection h=(HttpURLConnection) url.openConnection();
        InputStream in=h.getInputStream();
        if(h.getResponseCode()==HttpURLConnection.HTTP_OK){
            int c;
            while ((c=in.read())!=-1){
                System.out.print((char) c);
            }
            in.close();
        }
    }

}
