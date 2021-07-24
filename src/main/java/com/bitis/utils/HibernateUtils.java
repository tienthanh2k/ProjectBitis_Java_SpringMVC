package com.bitis.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.bitis.entity.ChiTietHoaDon;
import com.bitis.entity.ChiTietSanPham;
import com.bitis.entity.CuaHang;
import com.bitis.entity.DanhMuc;
import com.bitis.entity.GioHang;
import com.bitis.entity.HoaDon;
import com.bitis.entity.KhachHang;
import com.bitis.entity.LoaiKhachHang;
import com.bitis.entity.MauSac;
import com.bitis.entity.SanPham;
import com.bitis.entity.Size;



public class HibernateUtils {
	private static HibernateUtils hibernateUtils;

	private Configuration configuration;
	private SessionFactory sessionFactory;

	private HibernateUtils() {
		configure();
	}

	public static HibernateUtils getInstance() {
		if (null == hibernateUtils) {
			hibernateUtils = new HibernateUtils();
		}
		
		return hibernateUtils;
	}

	private void configure() {
		// load config
		configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		//EntityScanner.scanPackages("com.nguyentienthanh.entity").addTo(configuration);
		
		//configuration.addAnnotatedClass(Department.class);
		configuration.addAnnotatedClass(DanhMuc.class);
		configuration.addAnnotatedClass(SanPham.class);
		configuration.addAnnotatedClass(MauSac.class);
		configuration.addAnnotatedClass(Size.class);
		configuration.addAnnotatedClass(CuaHang.class);
		configuration.addAnnotatedClass(LoaiKhachHang.class);
		configuration.addAnnotatedClass(ChiTietHoaDon.class);
		configuration.addAnnotatedClass(ChiTietSanPham.class);
		configuration.addAnnotatedClass(HoaDon.class);
		configuration.addAnnotatedClass(KhachHang.class);
	}

	private SessionFactory buildSessionFactory() {
		if (null == sessionFactory || sessionFactory.isClosed()) {
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}
	
	public void closeSessionFactory() {
		if(null != sessionFactory) {
			sessionFactory.close();
		}
	}
	
	public Session openSession() {
		buildSessionFactory();
		return sessionFactory.openSession();
	}
}
