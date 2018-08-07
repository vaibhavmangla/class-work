import java.io.*;
public class bufferreader{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i=Integer.parseInt(br.readLine());
int j=Integer.parseInt(br.readLine());
int sum=i+j;
System.out.print(sum);
}
}