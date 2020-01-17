package com.deloitte.estore.application;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.model.Sellers;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImp;
import java.util.*;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class DeloitteEStoreApp {

	public static void main(String[] args) throws Exception {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Sellers.class)
				.buildSessionFactory();
		Sellers s=new Sellers(503,"MNO",202345);
		Sellers s1=new Sellers(504,"XYZ",201444);
		Product p=new Product(24,"Samsung",11000);
		List<Sellers> sellerList=Arrays.asList(s,s1);
		p.getSellers().add(s);
		p.getSellers().add(s1);
		Session ssn=sf.openSession();
		Transaction tx=ssn.beginTransaction();
		ssn.save(s);
		ssn.save(s1);
		ssn.save(p);
		tx.commit();
		ssn.close();
//		ProductService service=new ProductServiceImp();
//		Scanner sc=new Scanner(System.in);
//	Product product=new Product();
//	System.out.println("Enter option");
//		int n=sc.nextInt();
//		//Query q=ssn.createQuery("from Product");
//		//List<Product> products=q.getResultList();
//	//	products.forEach(System.out::println);
//		//ssn.save(product);
//	
//	
//	switch(n)
//	{
//	case 1:System.out.println("Enter the details of product:");
//			product.setProductId(sc.nextInt());
//			product.setProductName(sc.next());
//			product.setPrice(sc.nextFloat());
//			if(service.addProduct(product))
//			{
//				System.out.println("product added");
//			}
//			else
//			{
//				System.out.println("not added");
//			}
//	break;
//	case 2:System.out.println("Enter the product id which u want to delete:");
//			int d=sc.nextInt();
//			product.setProductId(d);
//		if(service.deleteProduct(product))
//			{
//			System.out.println("Product deleted...");
//			}
//		else
//			{
//			System.out.println("Not deleted");
//			}
//	break;
//	case 3:System.out.println("Enter the new value of price");
//			product.setPrice(sc.nextFloat());
//			System.out.println("Enter the product id to be updated");
//			product.setProductId(sc.nextInt());
//			if(service.updateProduct(product))
//			{
//			System.out.println("Product updated...");
//			}
//		else
//			{
//			System.out.println("Not updated");
//			}
//			break;
//	case 4:System.out.println("Enter the product id");
//			int s=sc.nextInt();
//			product=service.getProductById(s);
//			if(product!=null)
//			{
//			System.out.println("Product id:"+product.getProductId()+"\nProduct Name:"+product.getProductName()+"\nPrice:"+product.getPrice());
//			}
//		else
//			{
//			System.out.println("Not id present");
//			}
//			break;
//	case 5:System.out.println("Details are:");
//	    	List<Product> prod=new ArrayList<>();
//	    	prod=service.getAllProducts();
//	    	prod.forEach(System.out::println);
//	    	break;
//	default:System.out.println("Invalid option");
//			
//	}
//	
	}

}
