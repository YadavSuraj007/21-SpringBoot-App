package com.nareshit.helloworl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   // Any Product Related Functionality entry point to all fronEnd // For developing Software so i Leanning Coding //
                 // ProductController proObj=ioc.getProductController();
@RequestMapping(value="/product")
//http://localhost:8080/product ==> ProductController projObj=ioc.getProductController();
public class ProductController {
	
	// create Product
	
		// ProdObj.createProduct();
	@RequestMapping(value="/create")   // http://localhost:8080/product/create
	// http://localhost:8080/product ==> ProductController projObj.createProduct();
	public String createProduct() {
		return "Reached to create Product Functionality";
	}
	// Update Product // http://localhost:8080/product/update
		@RequestMapping(value="/update")  // ============>>>>>>>>>>>>>>http://localhost:8080/product/update
		//http://localhost:8080/product/update ==> projObj.update();
		public String updateProduct() {
			return "Reached to Update Product Functionality";
		}
		
		// Retrieve All Product
		@RequestMapping(value="/all")  //http://localhost:8080/product/all
		//http://localhost:8080/product/all  ==> prodObj.getAllProducts();
		public String getAllProducts() {
			return "Reached to All products Functionality";
			
		}
		
		// Retrieve Single Product
		@RequestMapping(value="/single")  //http://localhost:8080/product/single
		public String getSingleProduct() {
			return "Reached to Single products Functionality";
		}
		
		// Delete Product
		@RequestMapping(value="/Delete")  //http://localhost:8080/product/Delete
		public String DeleteProduct() {
			return "Reached to Delete Products Functionality";
		}

}
