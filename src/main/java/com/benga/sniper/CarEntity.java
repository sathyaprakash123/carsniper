package com.benga.sniper;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="snipercar")
public class CarEntity {
	
	@Id
	@Column(name = "modelname")
	private String modelName;
	
	@Column(name = "modelmaker")
	private String modelMaker;
	
	@Column(name = "modelpower")
	private String modelPower;
	
	@Column(name="modelprice")
	private int modelPrice;
	
	@Column(name="modeltype")
	private String modelType;

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelMaker() {
		return modelMaker;
	}

	public void setModelMaker(String modelMaker) {
		this.modelMaker = modelMaker;
	}

	public String getModelPower() {
		return modelPower;
	}

	public void setModelPower(String modelPower) {
		this.modelPower = modelPower;
	}

	public int getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(int modelPrice) {
		this.modelPrice = modelPrice;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
	
	
	

}
