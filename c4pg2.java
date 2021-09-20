import java.io.*;
import java.util.*;
class mfile
{
    String fname;
    void getname()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file name (.text):");
        fname = sc.next();
    }
    void wfile() throws Exception
    {
        FileOutputStream fos = new FileOutputStream(fname);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("welcome to java");
    }
    void rfile() throws Exception
    {
        FileInputStream fis = new FileInputStream(fname);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}
public class c4pg2
{
    public static void main(String ...a) throws Exception
    {
        mfile f = new mfile();
        f.getname();
        f.wfile();
        f.rfile();
    }
}