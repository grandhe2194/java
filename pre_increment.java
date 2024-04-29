
public class pre_increment {

public static void main(String[]args) {
	
	//pre increment
	int a=7;
	int h=++a;
	System.out.println(h); //8
    System.out.println(a);   //8
		


     //pre decrement
      int b=7;
      int x=--b;
      System.out.println(x); //6
      System.out.println(b);   //6
      
	
	
	//post increment
	int t =15;
	int y=t++;
	System.out.println(y);   //15
	System.out.println(t);     //16
	
	
	
	//post decrement
	int d =26;
    int m = d--;
    System.out.println(m);    //26
    System.out.println(d);      //25
    
}
}