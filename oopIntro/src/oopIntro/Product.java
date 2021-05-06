package oopIntro;

public class Product {
	
	private int id;
	private String name;
	private double unitPrice;        		//Birim fiyatý
	private String detail;
	private double discount;  		 		//Ýndirim oraný
	
	public Product() {  			//Constructor (Yapýcý) 
		
	}
	
									//	Ýmza
	public Product(int id, String name, double unitPrice, String detail, double discount) { //Overloading
		this();                    	//Bunu ekleyince parametresiz olaný da çalýþtýrmýþ oluyoruz.
		this.id = id;              	//This: Bu classtaki. Sað taraf imzaya denk
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;  
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}
	

}
