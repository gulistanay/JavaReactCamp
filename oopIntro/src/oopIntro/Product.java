package oopIntro;

public class Product {
	
	public Product() {  //Constructor (Yapýcý) 
		System.out.println("Ben çalýþtým");
	}
	
	//			  			Ýmza
	public Product(int id, String name, double unitPrice, String detail) { //Overloading
		this();                    //Bunu ekleyince parametresiz olaný da çalýþtýrmýþ oluyoruz.
		this.id = id;              //This: Bu classtaki. Sað taraf imzaya denk
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;        //Birim fiyatý
	String detail;

}
