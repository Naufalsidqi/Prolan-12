package TempatFutsal;

import java.util.Scanner;

/**
 *
 * @author Iscariot
 */
public class pelanggan {
	int no;
	String name;
	String bookingno;
//	int indate;
//	int outdate;
	int nod,type;
	boolean status;
	
	Customer()
	{
		no=-1;
		name=null;
		bookingno=null;
		nod=type=ld=d=-1;
		status=false;
	}
	
	public void setInitialDetails(int c)
	{
		
		no=c;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name");
		name = in.nextLine();
//		System.out.println("");
//		System.out.println("");
//		indate = in.nextInt();
		System.out.println("pilih lapang? 1 LapangBiasa,2 Lapang sistetis");
	    type = in.nextInt();
	    
	    
	    
	}
	
	public void setBookingNo(String b)
	{
		bookingno=b;
	}
	
	
}