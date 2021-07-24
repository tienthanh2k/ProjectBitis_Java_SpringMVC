package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.DanhMuc;
import com.bitis.repository.impl.IDanhMucRepository;
import com.bitis.utils.HibernateUtils;

@Repository
public class DanhMucRepository implements IDanhMucRepository{
	private HibernateUtils hibernateUtils;

	public DanhMucRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<DanhMuc> getAllDanhMuc() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<DanhMuc> query = session.createQuery("FROM DanhMuc");

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void addDanhMuc(DanhMuc danhMuc) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// save object
			session.save(danhMuc);

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public DanhMuc getDanhMucById(int id) {
		Session session = null;

		try {
			// get session
			session = hibernateUtils.openSession();

			// create hql query
			DanhMuc danhMuc = session.get(DanhMuc.class, id);

			return danhMuc;

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public DanhMuc getDanhMucByName(String name) {
		Session session = null;

		try {
			// get session
			session = hibernateUtils.openSession();

			// create hql query
			Query<DanhMuc> query = session.createQuery("FROM DanhMuc WHERE TenDanhMuc = :name");

			// set parameter
			query.setParameter("name", name);

			// return result
			return query.uniqueResult();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateDanhMuc(int id, String name) {
		Session session = null;

		try {
			// get session
			session = hibernateUtils.openSession();

			// begin transaction
			session.beginTransaction();

			// create hql query
			DanhMuc danhMuc = session.load(DanhMuc.class, id);

			// set department
			danhMuc.setTenDanhMuc(name);

			// commit transaction
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateDanhMuc(DanhMuc danhMuc) {
		Session session = null;

		try {
			// get session
			session = hibernateUtils.openSession();

			// begin transaction
			session.beginTransaction();

			// update object
			session.update(danhMuc);

			// commit transaction
			session.getTransaction().commit();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
