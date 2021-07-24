package com.bitis.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.SanPham;
import com.bitis.repository.impl.ISanPhamRepository;
import com.bitis.utils.HibernateUtils;

@Repository
public class SanPhamRepository implements ISanPhamRepository{
	private HibernateUtils hibernateUtils;

	public SanPhamRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<SanPham> getAllSanPhams() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<SanPham> query = session.createQuery("FROM SanPham");

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
	
	public List<SanPham> getSanPhamsByManyField(String[] arrSize, String[] mauArr, int minPrice, int maxPrice) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();
			
			StringBuilder hql = new StringBuilder("FROM SanPham WHERE donGia < " + maxPrice + " AND donGia > " + minPrice); 
			
			if(mauArr.length > 0 && mauArr != null) {
				hql.append(" AND (");
				for(int i = 0; i < mauArr.length; i ++) {
					hql.append("mauSac.maMau = " + mauArr[i]);
					if(i != mauArr.length-1) {
						hql.append(" OR ");
					}
				}
				hql.append(" )");
			}
			
			List<SanPham> list = session.createQuery(hql.toString()).getResultList();
			
			return list;
//			Criteria criteria = session.createCriteria(SanPham.class);
//			
//			
//			Criterion price1 = Restrictions.ge("donGia", (double) minPrice);
//			Criterion price2 = Restrictions.le("donGia", (double) maxPrice);
//			
//			LogicalExpression andExp = Restrictions.and(price1, price2);
//			
//			criteria.add(andExp);
//			
//			//SanPham sp = new SanPham();
//			
//			if(mauArr.length > 0 && mauArr != null) {
//				List<Criterion> list = new ArrayList<Criterion>();
//				for(int i = 0; i < mauArr.length; i ++) {
//					Criterion item = Restrictions.eq("mauSac.maMau", Integer.valueOf(mauArr[i]));
//					list.add(item);
//				}
//				Criteria orMauSac = 
//			}
//
//			return criteria.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}
