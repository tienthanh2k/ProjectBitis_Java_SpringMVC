package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.Size;
import com.bitis.repository.impl.ISizeRepository;
import com.bitis.utils.HibernateUtils;

@Repository
public class SizeRepository implements ISizeRepository{
	private HibernateUtils hibernateUtils;

	public SizeRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<Size> getAllSizes() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<Size> query = session.createQuery("FROM Size");

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
