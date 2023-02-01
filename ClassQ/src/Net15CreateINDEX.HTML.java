//Write a program to print the content of any given URL. Also save the
//content in an index.html file.
import java.net.*;
import java.io.*;
class Net15{
    public static void main(String [] args) throws IOException{
        URL url=new URL("https://www.xxx.com/");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();

        InputStream in=con.getInputStream();
//        OutputStream dos=
        FileOutputStream fos=new FileOutputStream("index.html");

        int c;
        while ((c=in.read())!=-1){
            System.out.print((char) c);
            fos.write(c);
        }
    }

}