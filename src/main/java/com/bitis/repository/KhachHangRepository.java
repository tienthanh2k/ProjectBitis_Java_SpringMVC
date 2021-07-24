package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.KhachHang;
import com.bitis.repository.impl.IKhachHangRepository;
import com.bitis.utils.HibernateUtils;

@Repository
public class KhachHangRepository implements IKhachHangRepository {
	@SuppressWarnings("unused")
	private HibernateUtils hibernateUtils;

	public KhachHangRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<KhachHang> getAllKhachHang() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			@SuppressWarnings("unchecked")
			Query<KhachHang> query = session.createQuery("FROM KhachHang");

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean checkAccount(String email, String password) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<KhachHang> query = session
					.createQuery("FROM KhachHang WHERE email = '" + email + "' AND matKhau = '" + password + "'");

			List<KhachHang> list = query.list();

			if (list == null || list.size() == 0) {
				return false;
			} else {
				return true;
			}

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public KhachHang getAccount(String email, String password) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<KhachHang> query = session
					.createQuery("FROM KhachHang WHERE email = '" + email + "' AND matKhau = '" + password + "'");
			
			List<KhachHang> list = query.getResultList();
			
			if(list == null || list.size() == 0) {
				return null;
			} else {
				return list.get(0);
			}

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean addAccount(KhachHang khachHang) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			session.getTransaction().begin();

			// save khachhang
			session.save(khachHang);

			session.getTransaction().commit();

			return true;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public KhachHang getAccountById(int maKhachHang) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			@SuppressWarnings("unchecked")
			Query<KhachHang> query = session.createQuery("FROM KhachHang WHERE maKH = " + maKhachHang);

			return query.getSingleResult();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean updateAccount(KhachHang khachHang) {
		Session session = null;

		try {
			// get session
			session = hibernateUtils.openSession();

			// begin transaction
			session.beginTransaction();

			// update object
			session.update(khachHang);

			// commit transaction
			session.getTransaction().commit();
			
			return true;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
