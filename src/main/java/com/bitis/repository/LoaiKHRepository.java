package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.LoaiKhachHang;
import com.bitis.utils.HibernateUtils;

@Repository
public class LoaiKHRepository {
	private HibernateUtils hibernateUtils;

	public LoaiKHRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<LoaiKhachHang> getAllLoaiKH() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<LoaiKhachHang> query = session.createQuery("FROM LoaiKhachHang");

			// return list LoaiKH
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
