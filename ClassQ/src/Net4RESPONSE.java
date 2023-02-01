import java.io.IOException;
import java.net.*;
public class Net4 {
    public static void main(String [] args) throws IOException
    {
        URL url=new URL("https://www.youtube.com/watch?v=Ps2q_purSrM");
        HttpURLConnection h=(HttpURLConnection) url.openConnection();
        System.out.println("resposne="+h.getResponseCode());
        System.out.println("connection timeout="+h.getConnectTimeout());
        System.out.println("response message="+h.getResponseMessage());
        System.out.println("encoding"+h.getContentEncoding());
        System.out.println("data="+h.getDate());
        System.out.println("length of content="+h.getContentLength());
        System.out.println("Type of content="+h.getContentType());
        System.out.println("request type="+h.getRequestMethod());
    }
}
