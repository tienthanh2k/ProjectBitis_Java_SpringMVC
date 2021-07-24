package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.HoaDon;
import com.bitis.repository.impl.IHoaDonRepository;
import com.bitis.utils.HibernateUtils;

@Repository
public class HoaDonRepository implements IHoaDonRepository{
	private HibernateUtils hibernateUtils;

	public HoaDonRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<HoaDon> getAllHoaDon() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<HoaDon> query = session.createQuery("FROM HoaDon");

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public int addHoaDon(HoaDon hoaDon) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			int index = (Integer) session.save(hoaDon);

			// return list DanhMuc
			return index;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}


}
