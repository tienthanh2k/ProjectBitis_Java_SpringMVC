package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.MauSac;
import com.bitis.utils.HibernateUtils;

@Repository
public class MauSacRepository {
	private HibernateUtils hibernateUtils;

	public MauSacRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<MauSac> getAllMauSac() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<MauSac> query = session.createQuery("FROM MauSac");

			// return list MauSac
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
