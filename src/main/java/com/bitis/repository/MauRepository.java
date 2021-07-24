package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.HoaDon;
import com.bitis.entity.MauSac;
import com.bitis.entity.Size;
import com.bitis.repository.impl.IHoaDonRepository;
import com.bitis.repository.impl.IMauSacRepository;
import com.bitis.repository.impl.ISizeRepository;
import com.bitis.utils.HibernateUtils;

@Repository
public class MauRepository implements IMauSacRepository{
	private HibernateUtils hibernateUtils;

	public MauRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<MauSac> getAllMauSacs() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<MauSac> query = session.createQuery("FROM MauSac");

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
