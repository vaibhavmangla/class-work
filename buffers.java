import java.io.*;
class buffers{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String i= br.readLine();
String j= br.readLine();
System.out.print(i+" "+j);
}
}