package com;

import java.util.StringTokenizer;

public class Chaine
{
    public static void main (String args [])
    {
        //"pu-bli-c,st-atic,voi-d,ma-in"
        // public static void main
        String s="";
        StringBuilder stringBuilder=new StringBuilder();
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<20;i++)
            //s+=i;
            //stringBuilder.append(i);
            stringBuffer.append(i);
        System.out.println(stringBuffer);
        String s1="pu-bli-c,st-atic,voi-d,ma-in";
        StringTokenizer stringTokenizer=new StringTokenizer(s1,"-");
        while (stringTokenizer.hasMoreTokens())
            System.out.println(stringTokenizer.nextToken());
    }
}
