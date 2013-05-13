package com.xxs.definedweek.service;

import java.io.File;

import com.xxs.definedweek.bean.GoodsImage;


/**
 * Service接口 - 商品图片

 * KEY: DEFINEDWEEK89343F3383F923F8C0F63F568A7EC7A7

 */

public interface GoodsImageService {
	
	/**
	 * 生成商品图片（大图、小图、缩略图）
	 * 
	 * @param goodsImageFile
	 *            图片文件
	 * 
	 */
	public GoodsImage buildGoodsImage(File goodsImageFile);

}