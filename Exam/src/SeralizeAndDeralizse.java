import java.io.*;
public class SeralizeAndDeralizse implements Serializable {
    String name;
    int roll;
    public SeralizeAndDeralizse(String name,int roll) {
       this.name=name;
       this.roll=roll;
    }
    public void Seralize(SeralizeAndDeralizse s)throws IOException,ClassNotFoundException{
        FileOutputStream fos=new FileOutputStream("nirmal.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();
    }
    public void Deralize()throws IOException,ClassNotFoundException{
        FileInputStream fis=new FileInputStream("b.tet");
        ObjectInputStream ous=new ObjectInputStream(fis);
        SeralizeAndDeralizse s=(SeralizeAndDeralizse) ous.readObject();
        ous.close();
        fis.close();
        s.show();
    }
    public void show(){
        System.out.println("name="+name);
        System.out.println("r0ll="+roll);
    }
    public static void main(String [] args)throws IOException,ClassNotFoundException{
        SeralizeAndDeralizse s=new SeralizeAndDeralizse("nirmal",19);
        s.Seralize(s);
        s.Deralize();
    }
}
