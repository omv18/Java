class StringConnectionPoolDemo {
    public static void main(String args[]) {
        String s1 = new String();
        System.out.println("S1 ---->"+s1);
        System.out.println("s1 hashCode-->"+ s1.hashCode());
        String s2 = new String();
        System.out.println("S2 ---->"+s2);
        System.out.println("s2 hashCode-->"+ s2.hashCode());
        String s3 = new String("Sourav");
        System.out.println("S3 ---->"+s3);
        System.out.println("s3 hashCode-->"+ s3.hashCode());
        String s4 = new String("Sourav");
        System.out.println("S4 ---->"+s4);
        System.out.println("s4 hashCode-->"+ s4.hashCode());
        String s5 = "Sourav";
        System.out.println("S5 ---->"+s5);
        System.out.println("s5 hashCode-->"+ s5.hashCode());
        String s6 = new String("Sourav Kumar");
        System.out.println("S6 ---->"+s6);
        System.out.println("s6 hashCode-->"+ s6.hashCode());
        String s7 = new String("Java");
        System.out.println("S7 ---->"+s7);
        System.out.println("s7 hashCode-->"+ s7.hashCode());
        String s8 = s7.intern();
        System.out.println("S8 ---->"+s8);
        System.out.println("s8 hashCode-->"+ s8.hashCode());
        String s9 = new String("java");
        System.out.println("S9 ---->"+s9);
        System.out.println("s9 hashCode-->"+ s9.hashCode());
        String s10 = "Java";
        System.out.println("S10 ---->"+s10);
        System.out.println("s10 hashCode-->"+ s10.hashCode());
        //internn 
        // String s1 = "Java";  
        // String s2 = "Java";  
        // String s3 = new String("Java");  
        // String s4 = new String("Java").intern();  
        // System.out.println((s1 == s2)+", String are equal."); // true  
        // System.out.println((s1 == s3)+", String are not equal."); // false  
        // System.out.println((s1 == s4)+", String are equal."); // true  
    }
}