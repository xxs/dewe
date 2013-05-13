package com.xxs.definedweek.dao.impl;

import java.util.Set;

import com.xxs.definedweek.dao.GoodsTypeDao;
import com.xxs.definedweek.entity.Goods;
import com.xxs.definedweek.entity.GoodsType;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类 - 商品类型

 * KEY: DEFINEDWEEK98FDAF6620D898936043F11DC7A029CC

 */

@Repository("goodsTypeDaoImpl")
public class GoodsTypeDaoImpl extends BaseDaoImpl<GoodsType, String> implements GoodsTypeDao {
	
	// 关联处理
	@Override
	public void delete(GoodsType goodsType) {
		Set<Goods> goodsSet = goodsType.getGoodsSet();
		int i = 0;
		for (Goods goods : goodsSet) {
			goods.setGoodsType(null);
			goods.setGoodsAttributeValueToNull();
			if(i % 20 == 0) {
				flush();
				clear();
			}
			i ++;
		}
		super.delete(goodsType);
	}

	// 关联处理
	@Override
	public void delete(String id) {
		GoodsType goodsType = super.load(id);
		this.delete(goodsType);
	}

	// 关联处理
	@Override
	public void delete(String[] ids) {
		for (String id : ids) {
			GoodsType goodsType = super.load(id);
			this.delete(goodsType);
		}
	}

}