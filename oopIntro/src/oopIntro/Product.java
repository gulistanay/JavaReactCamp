package oopIntro;

public class Product {
	
	public Product() {  //Constructor (Yap�c�) 
		System.out.println("Ben �al��t�m");
	}
	
	//			  			�mza
	public Product(int id, String name, double unitPrice, String detail) { //Overloading
		this();                    //Bunu ekleyince parametresiz olan� da �al��t�rm�� oluyoruz.
		this.id = id;              //This: Bu classtaki. Sa� taraf imzaya denk
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;        //Birim fiyat�
	String detail;

}
