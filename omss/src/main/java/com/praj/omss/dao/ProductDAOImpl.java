package com.praj.omss.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.praj.omss.entity.Product;

public class ProductDAOImpl implements ProductDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("omss");
	EntityManager manager = factory.createEntityManager();

	// EntityManager manager;
	public ProductDAOImpl() {
		// manager=DBUtil.getConnection();
	}

	@Override
	public boolean addProduct(int productId, String productName, String category, int quantity, long amount) {
		Product p = new Product();
		p.setProductId(productId);
		p.setProductName(productName);
		p.setCategory(category);
		p.setQuantity(quantity);
		p.setAmount(amount);

		manager.getTransaction().begin();
		manager.persist(p);
		manager.getTransaction().commit();
		return true;

	}

	@Override
	public Product updateProduct(Product product) {
		manager.merge(product);
		return product;
	}

	@Override
	public Product getSingleProduct(String category) {
		TypedQuery<Product> query = manager.createQuery("select cc from Product cc where cc.category=:category",
				Product.class);
		query.setParameter("category", category);
		Product product = query.getSingleResult();
		return product;
	}

	@Override
	public List<Product> getProductList() {
		TypedQuery<Product> query = manager.createQuery("select cc from Product cc ", Product.class);
		List<Product> list = query.getResultList();
		return list;
	}

	
	
}