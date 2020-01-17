package com.deloitte.estore.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import javax.persistence.Column;
@Entity
@Table(name="product_details")
public class Product {
		@Id
		@Column(name="product_id")
		//@GeneratedValue(strategy=GenerationType.AUTO)
		private int productId;
		@Column(name="product_name")
		private String productName;
		private float price;
		@OneToMany
		private List<Sellers> sellers=new ArrayList<>();
		public Product()
		{
			
		}

		

		public Product(int productId, String productName, float price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
	
		}



		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		
		public void setProductName(String productName) {
			this.productName = productName;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}
		
		
		
		public List<Sellers> getSellers() {
			return sellers;
		}



		public void setSellers(List<Sellers> sellers) {
			this.sellers = sellers;
		}



		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
					+ ", sellers=" + sellers + "]";
		}



		
		
}


		
		