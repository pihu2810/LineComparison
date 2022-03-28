package com.BridgeLabZ;

import java.util.Scanner;



public class LineComparisonUC4 
{
	
		  private double X1;
		  private double X2;
		  private double X3;
		  private double X4;
		  private double Y1;
		  private double Y2;
		  private double Y3;
		  private double Y4;
		  
		  public double getX1() {
			return X1;
		}
		public void setX1(int x1) {
			X1 = x1;
		}
		public double getX2() {
			return X2;
		}
		public void setX2(int x2) {
			X2 = x2;
		}
		public double getX3() {
			return X3;
		}
		public void setX3(int x3) {
			X3 = x3;
		}
		public double getX4() {
			return X4;
		}
		public void setX4(int x4) {
			X4 = x4;
		}
		public double getY1() {
			return Y1;
		}
		public void setY1(int y1) {
			Y1 = y1;
		}
		public double getY2() {
			return Y2;
		}
		public void setY2(int y2) {
			Y2 = y2;
		}
		public double getY3() {
			return Y3;
		}
		public void setY3(int y3) {
			Y3 = y3;
		}
		public double getY4() {
			return Y4;
		}
		public void setY4(int y4) {
			Y4 = y4;
		}
		public void LineLength(double X1,double X2,double Y1,double Y2,double X3,double X4,double Y3,double Y4) 
		{
		    double Length1=Math.sqrt(Math.pow(X2-X1, 2)+(Math.pow(Y2-Y1, 2)));
			  System.out.println("The distance between two Lengths = "+Length1);
			double  Length2=Math.sqrt(Math.pow(X4-X3, 2)+(Math.pow(Y4-Y3, 2)));
			  System.out.println("The distance between two Lengths = "+Length2);
			  if(Length1==Length2) 
			  {
				  System.out.println(" Two Lines are equal");
			  }else 
				  if(Length1>=Length2) 
				  {
				  
				  System.out.println(" Line1 is greater than Line2");
			  }
			  else if(Length1<=Length2) {
				  System.out.println(" Line1 is less than Line2 ");
			  }
		}
		public static void main(String args[])
		{
			 Scanner sc=new Scanner(System.in);
			  System.out.print("Enter the value of X1 =");
			  int X1=sc.nextInt();
			  System.out.print("Enter the value of X2 =");
			  int X2=sc.nextInt();
			  System.out.print("Enter the value of Y1 =");
			  int Y1=sc.nextInt();
			  System.out.print("Enter the value of Y2 =");
			  int Y2=sc.nextInt();
			  System.out.print("Enter the value of X3 =");
			  int X3=sc.nextInt();
			  System.out.print("Enter the value of X4 =");
			  int X4=sc.nextInt();
			  System.out.print("Enter the value of Y3 =");
			  int Y3=sc.nextInt();
			  System.out.print("Enter the value of Y4 =");
			  int Y4=sc.nextInt();
			
			  sc.close();
			  
			  LineComparisonUC4 myObj=new LineComparisonUC4();
			  myObj.setX1(X1);
			  myObj.setX2(X2);
			  myObj.setX3(X3);
			  myObj.setX4(X4);
			  myObj.setY1(Y1);
			  myObj.setY2(Y2);
			  myObj.setY3(Y3);
			  myObj.setY4(Y4);
			  myObj.LineLength(myObj.getX1(), myObj.getX2(), myObj.getY1(), myObj.getY2(), myObj.getX3(),myObj.getX4(),myObj.getY3(),myObj.getY4());
		}
}
