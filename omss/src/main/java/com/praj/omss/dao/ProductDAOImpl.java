package com.praj.omss.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.praj.omss.entity.Product;
import com.praj.omss.util.DBUtil;

public class ProductDAOImpl implements ProductDAO {

	EntityManager manager;
	public ProductDAOImpl()
	{
		manager=DBUtil.getConnection();
	}
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(product);
		manager.getTransaction().commit();
		return product;
		
	}
	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub

		manager.merge(product);
		return product;
	}
	@Override
	public Product viewProduct(int productId) {
		// TODO Auto-generated method stub
		TypedQuery<Product> query=manager.createQuery("select cc from Products cc where cc.product_Id=:productId",Product.class);
		query.setParameter("productId", productId);
		Product product=query.getSingleResult();
		return product;
	}
	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		TypedQuery<Product> query=manager.createQuery("select cc from Products cc ",Product.class);
		List<Product> list=query.getResultList();
		return list;
	}
	
}