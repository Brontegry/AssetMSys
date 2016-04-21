/**
 * 资产类别dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.vo.AssetCategory;


/**
 * @author ye
 * @date 2016/4/19
 */
public interface IAssetCategoryDao {
	/**
	 * 创建资产类别
	 * @param assetcategory
	 */
	public void createAssetCategory(AssetCategory assetCategory); 
	
	/**
	 * 删除资产类别
	 * @param assetcategory
	 */
	public void deleteAssetCategory(AssetCategory assetCategory); 
	
	/**
	 * 更新资产类别
	 * @param assetcategory
	 */
	public void updateAssetCategory(AssetCategory assetCategory); 
	
	/**
	 * 查询资产类别
	 * @return
	 */
	public List<AssetCategory> findAssetCategory();
	
	/**
	 * 通过id查询资产类别
	 * @return
	 */
	public AssetCategory findAssetCategoryById(int acid);
	
}
