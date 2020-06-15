package com.infosys.project1.product.dto;

import java.util.Optional;

import com.infosys.project1.product.entity.Product;

public class ProductDTO {
	int prodid;
	String brand;
	String category;
	String description;
	String image;
	double price;
	String productName;
	int rating;
	int sellerId;
	int stock;
	String subcategory;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public  double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public static ProductDTO valueof(Product p1) {
		ProductDTO product= new ProductDTO();
		product.setProdid(p1.getProdid());
		product.setBrand(p1.getBrand());
		product.setCategory(p1.getCategory());
		product.setDescription(p1.getDescription());
		product.setImage(p1.getImage());
		product.setPrice(p1.getPrice());
		product.setProductName(p1.getProductName());
		product.setRating(p1.getRating());
		product.setSellerId(p1.getSellerId());
		product.setStock(p1.getStock());
		product.setSubcategory(p1.getSubCategory());
		
		return product;
	}
	
	public static ProductDTO valueon(Optional<Product> product2) {
		ProductDTO product= new ProductDTO();
		product.setProdid(product2.get().getProdid());
		product.setBrand(product2.get().getBrand());
		product.setCategory(product2.get().getCategory());
		product.setDescription(product2.get().getDescription());
		product.setImage(product2.get().getImage());
		product.setPrice(product2.get().getPrice());
		product.setProductName(product2.get().getProductName());
		product.setRating(product2.get().getRating());
		product.setSellerId(product2.get().getSellerId());
		product.setStock(product2.get().getStock());
		product.setSubcategory(product2.get().getSubCategory());
		
		return product;
	}
	public Product createEntity() {
		Product pe=new Product();
		pe.setBrand(this.getBrand());
		pe.setCategory(this.getCategory());
		pe.setDescription(this.getDescription());
		pe.setImage(this.getImage());
		pe.setPrice(this.getPrice());
//		pe.setProdid(9);
		pe.setSubCategory(this.getSubcategory());
		pe.setProductName(this.getProductName());
		pe.setRating(this.getRating());
		pe.setSellerId(this.getSellerId());
		pe.setStock(this.getStock());
		return pe;
		
	}
}

