package jcmd;
import sun.org.mozilla.javascript.internal.Function;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created with IntelliJ IDEA.
 * User: kostua
 * Date: 25.06.13
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
public class jcmd {
    public jcmd()
    {   String cmd="";
        while (true)
        {
            write(">");cmd=read();
            String[] args=parse(cmd);
            if(cmd.equals("exit")) break;
        }
        //String r=this.read();
        //String[] rr=parse(r);
        //this.write(rr);
    }
    public void write(Object str)
    {
         System.out.print(str);
    }
    public void writeln(Object str)
    {
        System.out.println(str);
    }
    public String read(int count)
    {
        String result=new String();
       for (int i=0;i<count;i++)
       {
           try {
               char r=(char)System.in.read();
               result+=r;
           } catch (IOException e) { }
       }
        return result;
    }
    public String read()
    {
        String result="";
        byte bKbd[] = new byte[256];
        int iCnt = 0;
            try {
                iCnt = System.in.read(bKbd);
            } catch (IOException ex)
            {
                System.out.println(ex.toString());
            }
            result = new String(bKbd, 0, iCnt).trim();
        return result;
    }
    public int readint()
    {
        String result=read();
        Integer intVal = new Integer(result);
        return intVal.intValue();
    }
    public void readln()
    {
        System.out.println();
    }
    public String[] parse(String str)
    {
        StringTokenizer tokenizer=new StringTokenizer(str," ");
        String[] tokens=new String[tokenizer.countTokens()];
        int i=0;
        while (tokenizer.hasMoreTokens())
        {
            String t=tokenizer.nextToken();
            tokens[i++]=t;
        }
        return tokens;
    }
}
