package com.rajeshpatkar;

public class FindingHighest
{
    public static void main(String[] args){
        int[] a = new int[10];
        System.out.println("Initializing array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = (i*27)%19*3;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int x = findHighest(a);
        System.out.println("highest number is "+x);
        System.out.println(a);
    }
    
    public static int findHighest(int[] a)
    {
        int max=a[0];
        for(int i=0;i<a.length ; i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
}

