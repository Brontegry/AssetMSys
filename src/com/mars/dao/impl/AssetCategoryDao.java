/**
 * 资产类别dao层实现类
 */
package com.mars.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mars.dao.IAssetCategoryDao;
import com.mars.factory.HibernateSessionFactory;
import com.mars.vo.AssetCategory;

/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetCategoryDao extends HibernateDaoSupport implements
		IAssetCategoryDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.dao.IAssetCategoryDao#createAssetCategory(com.mars.vo.AssetCategory
	 * )
	 */
	public void createAssetCategory(AssetCategory assetCategory) {
		super.getHibernateTemplate().save(assetCategory);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.dao.IAssetCategoryDao#deleteAssetCategory(com.mars.vo.AssetCategory
	 * )
	 */
	public void deleteAssetCategory(AssetCategory assetCategory) {
		super.getHibernateTemplate().delete(assetCategory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetCategoryDao#findAssetCategory()
	 */
	@SuppressWarnings("unchecked")
	public List<AssetCategory> findAssetCategory() {
		return (List<AssetCategory>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<AssetCategory> list = new ArrayList<AssetCategory>();
						try {
							Criteria criteria = session
									.createCriteria(AssetCategory.class);
							list = (List<AssetCategory>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.dao.IAssetCategoryDao#updateAssetCategory(com.mars.vo.AssetCategory
	 * )
	 */
	public void updateAssetCategory(AssetCategory assetCategory) {
		super.getHibernateTemplate().update(assetCategory);
	}

	

	/**
	 * 通过ID查找资产类别
	 */
	public AssetCategory findAssetCategoryById(int acid) {
		AssetCategory assetCategory = (AssetCategory) HibernateSessionFactory.getSession().get(AssetCategory.class, acid);
        return assetCategory;
	}

}
