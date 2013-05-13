package com.xxs.definedweek.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.xxs.definedweek.util.SettingUtil;

import org.hibernate.annotations.ForeignKey;

/**
 * Bean类 - 订单项

 * KEY: DEFINEDWEEK51EFC4FAC53E35EE0A29EEC65F82EE9C

 */

@Entity
public class OrderItem extends BaseEntity {
	
	private static final long serialVersionUID = 5030818078599298690L;
	
	private String productSn;// 商品货号
	private String productName;// 商品名称
	private BigDecimal productPrice;// 商品价格
	private Integer productQuantity;// 商品数量
	private Integer deliveryQuantity;// 发货数量
	private String goodsHtmlPath;// 商品HTML静态文件路径
	
	private Order order;// 订单
	private Product product;// 商品
	
	@Column(nullable = false, updatable = false)
	public String getProductSn() {
		return productSn;
	}
	
	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}
	
	@Column(nullable = false, updatable = false)
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Column(nullable = false, precision = 15, scale = 5)
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = SettingUtil.setPriceScale(productPrice);
	}
	
	@Column(nullable = false, updatable = false)
	public String getGoodsHtmlPath() {
		return goodsHtmlPath;
	}

	public void setGoodsHtmlPath(String goodsHtmlPath) {
		this.goodsHtmlPath = goodsHtmlPath;
	}

	@Column(nullable = false)
	public Integer getProductQuantity() {
		return productQuantity;
	}
	
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	@Column(nullable = false)
	public Integer getDeliveryQuantity() {
		return deliveryQuantity;
	}

	public void setDeliveryQuantity(Integer deliveryQuantity) {
		this.deliveryQuantity = deliveryQuantity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	@ForeignKey(name = "fk_order_item_order")
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@ForeignKey(name = "fk_order_item_product")
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	// 获取小计价格
	@Transient
	public BigDecimal getSubtotalPrice() {
		BigDecimal subtotalPrice = productPrice.multiply(new BigDecimal(productQuantity.toString()));
		return SettingUtil.setPriceScale(subtotalPrice);
	}
	
}