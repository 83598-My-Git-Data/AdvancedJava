//package com.sunbeam.beans;
//
//import com.sunbeam.dao.ProductDao;
//import com.sunbeam.dao.ProductDaoImpl;
//import com.sunbeam.entities.Products;
//
//public class ProductBean {
//	//bind request paramters to java beans 'props 
//	private String name;
//	private double price;
//	private int quantity;
//	private long  categoryId;
//	
//	
//	private ProductDao productDao;
//	public ProductBean()
//	{
//		ProductDao Dao =new ProductDaoImpl();
//		System.out.println("product bean created");
//	}
//	
//	public ProductBean(String name, double price, int quantity, long categoryId) {
//		super();
//		this.name = name;
//		this.price = price;
//		this.quantity = quantity;
//		this.categoryId = categoryId;
//	}
//	@Override
//	public String toString() {
//		return "ProductBean [name=" + name + ", price=" + price + ", quantity=" + quantity + ", categoryId="
//				+ categoryId + "]";
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public long getCategoryId() {
//		return categoryId;
//	}
//	public void setCategoryId(long categoryId) {
//		this.categoryId = categoryId;
//	}
//	//add b.l method tp add a new product
//	public String addNewProduct()
//	{
//		System.out.println("inadd product "+categoryId);
//		Products product=new Products(name,price,quantity);
//		
//		return productDao.addProduct(categoryId,product);
//		
//	}
//	
//	
//
//}
