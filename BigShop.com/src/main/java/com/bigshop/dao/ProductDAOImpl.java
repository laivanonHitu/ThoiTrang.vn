package com.bigshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigshop.entity.Post;
import com.bigshop.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	Logger logger = LoggerFactory.getLogger(postDAOImpl.class);

	@Override
	public void save(Product product) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.persist(product);
			logger.debug("save product info" + session);
		} catch (Exception e) {
			System.out.println("error save product " + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProduct() {
		try {
			return sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		} catch (Exception e) {
			System.out.println(" co loi ay du lieu " + e);
			return new ArrayList<>();
		}
	}

	@Override
	public void updatePost(Product product) {

	}

	@Override
	public void deleteProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "DELETE FROM Product WHERE id = :id";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Post.class);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public Post getPostById(int id) {
		return null;
	}

}
