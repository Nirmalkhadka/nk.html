//to print all https request headers
import java.net.*;
import java.io.*;
import java.util.*;
class Net5{
    public static void main(String [] args) throws IOException
    {
        URL url=new URL("https://www.youtube.com/");
        URLConnection cn=(HttpURLConnection)url.openConnection();
        Map<String,List<String>>headers=cn.getHeaderFields();
        for (Map.Entry<String,List<String>>h:headers.entrySet()){
            System.out.println(h.getKey()+"asdf"+h.getValue());
        }
    }
}