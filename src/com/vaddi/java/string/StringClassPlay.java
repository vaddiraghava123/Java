package com.vaddi.java.string;

public class StringClassPlay{
    
    public static void main(String...strings) {
        System.out.println("Testing VC");
        
        Exception e = new ClassCastException();
        if(e instanceof RuntimeException) {
        	System.out.println("Run time exception");
        } else {
        	System.out.println("Checked exception");
        }
        
        String s = "Raghava";
        s = "Raghu";
        s="Testing";
        System.out.println("S value is "+ s);
        String s3 ="Raghavendra";
        
        String s2 = new String("Raghu");
        s2="Raghu";
        String s4 = new String("Raghu");
        System.out.println("s2 Value ::" + s2);
        System.out.println("S111 compare  "+ (s2==s4));
        System.out.println("S compare  "+ (s2==s3));
        System.out.println("S compare 11 "+ s.equals(s2));
        System.out.println("S compare 112 "+ s.equals(s3));
        System.out.println("S compare 222 :::"+ (s==s3));
        s2 = "V";
        System.out.println("S value is "+ s2);
        
        StringBuffer s1 = new StringBuffer(s);
        s1.append("Test");
        s1.append("Addition");
        System.out.println("S1 value is "+ s1);
    }
}
