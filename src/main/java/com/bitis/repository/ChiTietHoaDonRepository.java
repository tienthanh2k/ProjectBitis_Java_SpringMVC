package com.bitis.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.bitis.entity.ChiTietHoaDon;
import com.bitis.entity.ChiTietHoaDonKey;
import com.bitis.entity.ChiTietSanPham;
import com.bitis.entity.CuaHang;
import com.bitis.entity.SanPham;
import com.bitis.repository.impl.IChiTietHoaDonRepository;
import com.bitis.repository.impl.IChiTietSanPhamRepository;
import com.bitis.utils.HibernateUtils;

@Repository
public class ChiTietHoaDonRepository implements IChiTietHoaDonRepository{
	private HibernateUtils hibernateUtils;

	public ChiTietHoaDonRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<ChiTietHoaDon> getAllChiTietHoaDon() {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();

			// create hql query
			Query<ChiTietHoaDon> query = session.createQuery("FROM ChiTietHoaDon");

			// return list DanhMuc
			return query.list();

		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean addChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		Session session = null;

		try {
			// get session
			session = HibernateUtils.getInstance().openSession();
			
			session.getTransaction().begin();

			ChiTietHoaDonKey id = (ChiTietHoaDonKey) session.save(chiTietHoaDon);
			
			session.getTransaction().commit();
			if(null != id ){
				return true;
			}else{
				return false;
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}


}
