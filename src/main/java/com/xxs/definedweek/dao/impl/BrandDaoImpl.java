package com.xxs.definedweek.dao.impl;

import java.util.Set;

import com.xxs.definedweek.dao.BrandDao;
import com.xxs.definedweek.entity.Brand;
import com.xxs.definedweek.entity.Goods;
import com.xxs.definedweek.entity.GoodsType;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 品牌

 * KEY: DEFINEDWEEK64B5A05594CB1C3B74C8A9B4F94F5991

 */

@Repository("brandDaoImpl")
public class BrandDaoImpl extends BaseDaoImpl<Brand, String> implements BrandDao {
	
	// 关联处理
	@Override
	public void delete(Brand brand) {
		Set<Goods> goodsSet = brand.getGoodsSet();
		if (goodsSet != null) {
			for (Goods goods : goodsSet) {
				goods.setBrand(null);
			}
		}
		
		Set<GoodsType> goodsTypeSet = brand.getGoodsTypeSet();
		if (goodsTypeSet != null) {
			for (GoodsType goodsType : goodsTypeSet) {
				goodsType.getBrandSet().remove(brand);
			}
		}
		
		super.delete(brand);
	}

	// 关联处理
	@Override
	public void delete(String id) {
		Brand brand = load(id);
		this.delete(brand);
	}

	// 关联处理
	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			Brand brand = load(id);
			this.delete(brand);
		}
	}
	
}