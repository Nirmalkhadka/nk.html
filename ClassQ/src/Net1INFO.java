import java.net.*;
class Net1{
    public static void main(String [] args) throws MalformedURLException, java.net.URISyntaxException
    {
        URL url=new URL("http://www.nirmal.com/path/file/search?name=nirmal#fb");
        System.out.println("protocol="+url.getProtocol());
        System.out.println("host="+url.getHost());
        System.out.println("authority="+url.getAuthority());
        System.out.println("port="+url.getPort());
        System.out.println("Defult port="+url.getDefaultPort());
        System.out.println("path="+url.getPath());
        System.out.println("fie="+url.getFile());
        System.out.println("query="+url.getQuery());
        System.out.println("ref="+url.getRef());
        System.out.println("url="+url.toURI());
    }
}
