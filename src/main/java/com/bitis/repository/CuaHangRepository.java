package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.CuaHang;
import com.bitis.utils.HibernateUtils;

@Repository
public class CuaHangRepository {
	private HibernateUtils hibernateUtils;

	public CuaHangRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<CuaHang> getAllCuaHang() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<CuaHang> query = session.createQuery("FROM CuaHang");

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}


}
