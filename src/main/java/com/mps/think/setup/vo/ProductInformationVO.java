package com.mps.think.setup.vo;

import com.mps.think.setup.model.OrderCodesSuper;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.RateCards;
import com.mps.think.setup.model.Taxonomy;

public class ProductInformationVO {

	private Integer id;
	private String product;
	private String description;
	private Double price;
	private Taxonomy taxonomy;
	private String size;
	private String style;
	private String colour;
	private String inventoryID;
	private OrderCodesSuper orderCode;
	private RateCards rateCard;
	private String TagLine;
	private String Premium;
	private Publisher publisher;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Taxonomy getTaxonomy() {
		return taxonomy;
	}
	public void setTaxonomy(Taxonomy taxonomy) {
		this.taxonomy = taxonomy;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getInventoryID() {
		return inventoryID;
	}
	public void setInventoryID(String inventoryID) {
		this.inventoryID = inventoryID;
	}
	public OrderCodesSuper getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(OrderCodesSuper orderCode) {
		this.orderCode = orderCode;
	}
	public RateCards getRateCard() {
		return rateCard;
	}
	public void setRateCard(RateCards rateCard) {
		this.rateCard = rateCard;
	}
	public String getTagLine() {
		return TagLine;
	}
	public void setTagLine(String tagLine) {
		TagLine = tagLine;
	}
	public String getPremium() {
		return Premium;
	}
	public void setPremium(String premium) {
		Premium = premium;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "ProductInformationVO [id=" + id + ", product=" + product + ", description=" + description + ", price="
				+ price + ", taxonomy=" + taxonomy + ", size=" + size + ", style=" + style + ", colour=" + colour
				+ ", inventoryID=" + inventoryID + ", orderCode=" + orderCode + ", rateCard=" + rateCard + ", TagLine="
				+ TagLine + ", Premium=" + Premium + ", publisher=" + publisher + "]";
	}
}
