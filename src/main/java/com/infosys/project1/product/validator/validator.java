package com.infosys.project1.product.validator;

import com.infosys.project1.product.dto.ProductDTO;

public class validator {
	public static void ProdValidate(ProductDTO productdto) throws Exception {
		if(!(name(productdto.getProductName()))){
			throw new Exception("Name is not valid");
		}
		else if(!(description(productdto.getDescription()))) {
			throw new Exception("Description  is not valid");
		}
		else if(!(price(productdto.getPrice()))) {
			throw new Exception("Price is not valid");
		}
		else if(!(stock(productdto.getStock()))) {
			throw new Exception("Stock is not valid");
			}
		else if(!(image(productdto.getImage()))) {
			throw new Exception("Stock is not valid");
			}
		System.out.println("in validator");
		}


public static boolean name(String name){
	if(name.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$") && name.length()<=100) {
		return true;
	}
	else {
		return false;
	}}

public static boolean description(String description){
	if(description.length()<=500) {
		return true;
	}else {
		return false;
	}}

public static boolean price(double num){
	if(num<=200.00) {
		return true;
	}else {
		return false;
	}}

public static boolean  stock(Integer num){
	if (num>=10) {
		return true;
	}else {
		return false;
	}}

public static boolean  image(String img){
	if(img.equals("png") || img.equals("jpeg")) {
		return true;
	}else {
		return false;
	}}


}