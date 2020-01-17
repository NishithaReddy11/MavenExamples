package com.deloitte.estore.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="seller")
 
public class Sellers {

		@Id
		@Column(name="sid")
		//@GeneratedValue(strategy=GenerationType.AUTO)
		private int sellerId;
		@Column(name="seller_name")
		private String sellerName;
		private int gstn;
		public Sellers()
		{
			
		}
		public Sellers(int sellerId, String sellerName, int gstn) {
			super();
			this.sellerId = sellerId;
			this.sellerName = sellerName;
			this.gstn = gstn;
		}
		public int getSellerId() {
			return sellerId;
		}
		public void setSellerId(int sellerId) {
			this.sellerId = sellerId;
		}
		public String getSellerName() {
			return sellerName;
		}
		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}
		public int getGstn() {
			return gstn;
		}
		public void setGstn(int gstn) {
			this.gstn = gstn;
		}
		@Override
		public String toString() {
			return "Sellers [sellerId=" + sellerId + ", sellerName=" + sellerName + ", gstn=" + gstn + "]";
		}
		
}
