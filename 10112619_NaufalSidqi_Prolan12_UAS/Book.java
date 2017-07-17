package TempatFutsal;

/**
 *
 * @author Iscariot
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable{
	String bookno;
	Transportation t[][][];
	int ff;
	pelanggan cust;
	int s1=0,s2=0;
	
	
	public String getBookingNumber()
	{
		return bookno;
	}
	
	public void BookNew(pelanggan p,LapangBiasa lb,LapangSistetis ls,Transportation tr[][][],int ily,int flag1,int idx,int flag2,int isdx,int flag3)
	
	{
		cust=c;
	    Fare f=new Fare();
	    int no,i;
	    
    	t=tr;
    	l=lr;
    	
	    if(p.type==1)
	    {
	    			if(flag1==0)
	    			{
	    				System.out.println("lapang biasa tersedia");
	    				Scanner in5=new Scanner(System.in);
	    				
	    				System.out.println("pilih lapang mana? lapang sistetis (2)  ");
	    				int g=in5.nextInt();
	    				
	    				if(g==2)
		    				BookLapangBiasa(p,lb,g,insa);
	    			}
	    			if(flag1==1)
	    				BookLapangSistetis(p,lb,p.type,isa);
	    }
	    if(p.type==2)
	    {
	    			if(flag2==0)
	    			{
	    				System.out.println("lapang sistetis tersedia");
	    				Scanner in6=new Scanner(System.in);
	    				
	    				System.out.println("pilih lapang mana? lapang biasa (1)");
	    				int g=in6.nextInt();
	    				
	    				if(g==2)
		    				BookLapangBiasa(p,lb,g,insa);
	    			}
	    			if(flag2==1)
	    				BookLapangSistetis(P,LB,P.type,isa);
	    }
	    
	    
	
	
	
	public void BookLapangBiasa(pelanggan p,LapangBiasa lb,int type,int isa,int h)
	{
		Fare f=new Fare();
		ly.statuschange();
		
		if(ld==2)
		{
			System.out.println("2 lapang biasa sudah terisi");
			ff= f.farecalculator(h,y.rate);
			bookno=ily+"lx2";
			BookDisplay(ff,c.name,t[ily][0][0].getTotalCost(),l[ily][0][1].getTotalCost(),bookno);
			
		}
		if(ld==4)
		{
			System.out.println("4 lapang biasa sudah di booking");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx4";
			BookDisplay(ff,c.name,t[isa][1][0].getTotalCost(),l[isa][1][1].getTotalCost(),bookno);
		}
		if(ld==6)
		{
			System.out.println("6 lapang biasa telah di booking");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx6";
			BookDisplay(ff,c.name,t[isa][0][0].getTotalCost(),l[isa][0][1].getTotalCost(),bookno);
			
		}
		
		
	}
	
	public void BookLapangSistetis(pelanggan p,LapangSistetis dx,int type,int idx,int ld,int d)
	{
		dx.statuschange();
		Fare f=new Fare();
		
		if(ld==2)
		{
			System.out.println("2 lapang biasa sudah terisi");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx2";
			BookDisplay(ff,c.name,t[insa][0][0].getTotalCost(),l[isna][0][1].getTotalCost(),bookno);
			
		}
		if(ld==4)
		{
			System.out.println(" 4 lapang biasa sudah di booking");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx4";
			BookDisplay(ff,c.name,t[insa][1][0].getTotalCost(),l[isna][1][1].getTotalCost(),bookno);
		}
		if(ld==6)
		{
			System.out.println("6 lapang biasa telah di booking");
			ff= f.farecalculator(h,ly.rate);
			bookno=ily+"lx6";
			BookDisplay(ff,c.name,t[isna][0][0].getTotalCost(),l[isna][0][1].getTotalCost(),bookno);
			
		}
		
		
	}
	

	public void BookDisplay(int ff,String name,int tr,String b)
	{
		System.out.println("Booking number "+bookno);
		
		System.out.println("pelanggan number "+cust.no);
		
		System.out.println("Booking Name "+name);
		
		System.out.println("Fare is "+ ff);
		
		System.out.println("Total cost of transportation is "+ tr);
		
	}
	
	
	public int getFare()
	{
		return ff;
	}
	
	public String getName()
	{
		return cust.name;
	}
	