package com.finalproject.jewellery.global;

import java.util.ArrayList;
import java.util.List;

import com.finalproject.jewellery.model.Product;

public class GlobalData {
	
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}

}
