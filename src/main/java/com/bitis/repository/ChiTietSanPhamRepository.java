package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.ChiTietSanPham;
import com.bitis.entity.SanPham;
import com.bitis.repository.impl.ISanPhamRepository;
import com.bitis.utils.HibernateUtils;

@Repository
public class ChiTietSanPhamRepository{
	private HibernateUtils hibernateUtils;

	public ChiTietSanPhamRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<ChiTietSanPham> getAllChiTietSanPhams() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<ChiTietSanPham> query = session.createQuery("FROM ChiTietSanPham");

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public SanPham getSanPhamById(int id) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<SanPham> query = session.createQuery("FROM SanPham WHERE maSanPham = " + id);

			// return list DanhMuc
			return query.getSingleResult();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public List<SanPham> getSanPhamsByDanhMuc(int maDanhMuc) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<SanPham> query = session.createQuery("FROM SanPham WHERE maDanhMuc = " + maDanhMuc);

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
