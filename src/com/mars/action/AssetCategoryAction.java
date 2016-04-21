/**
 * 测试资产类别action
 */
package com.mars.action;

import com.mars.service.IAssetCategoryService;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetCategoryAction extends ActionSupport{
	private IAssetCategoryService assetCategoryService;

	public IAssetCategoryService getAssetCategoryService() {
		return assetCategoryService;
	}

	public void setAssetCategoryService(IAssetCategoryService assetCategoryService) {
		this.assetCategoryService = assetCategoryService;
	}
	
	/**
	 * 创建
	 * @return
	 */
	public String createAssetCategory() {
		assetCategoryService.createAssetCategory();
		return "createAssetCategory";
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String deleteAssetCategory() {
		System.out.println("action");
		assetCategoryService.deleteAssetCategory();
		return "deleteAssetCategory";
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateAssetCategory() {
		assetCategoryService.updateAssetCategory();
		return "updateAssetCategory";
	}
	
	/**
	 * 查找
	 * @return
	 */
	public String findAssetCategory() {
		assetCategoryService.findAssetCategory();
		return "findAssetCategory";
	}
	
}
