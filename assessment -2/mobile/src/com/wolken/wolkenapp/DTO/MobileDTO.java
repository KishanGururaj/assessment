package com.wolken.wolkenapp.DTO;

public class MobileDTO {
	private int mobileId;
	private String modelName ;
	private int price ;
	private String memory;
	private String brandName;
	private int serialNumber;
	private int noOfCamera;
	public MobileDTO(){
		
        }
	public void setMobileId(int mobileId){
		this.mobileId =mobileId;
		}
 	public void setModelName(String modelName){
		this.modelName =modelName;
		}
	public void setPrice(int price){
		this.price =price;
		}
  	public void setMemory(String  memory){
		this.memory =memory;
		}
	public void setBrandName(String  brandName){
		this.brandName =brandName;
		}
	public void setSerialNumber(int serialNumber){
		this.serialNumber =serialNumber;
		}
	public void setNoOfCamera(int noOfCamera){
		this.noOfCamera=noOfCamera;
		}
	public int getMobileId(){
		return mobileId;
		}
	public String getModelName(){
		return modelName;
		}
	public int getPrice(){
		return price;
		}
  	public String getMemory(){
		return memory;
		}
	public String getBrandName(){
		return brandName;
		}
	public int getSerialNumber(){
		return serialNumber;
		}
	public int  getNoOfCamera(){
		return noOfCamera;
		}
	
	@Override
	public String toString() {
		return "MobileDTO: mobileId"+this.mobileId+" ModelName: "+this.modelName+" Price: "
				+this.price+" Memory: "+this.memory+" brandName"+this.brandName+" SerialNumber: "
				+this.serialNumber+" No of camera:"+this.noOfCamera;
		
	}
}

