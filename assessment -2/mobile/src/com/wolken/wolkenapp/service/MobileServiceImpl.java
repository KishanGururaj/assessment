package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.DAO.MobileDAO;
import com.wolken.wolkenapp.DAO.MobileDAOImpl;
import com.wolken.wolkenapp.DTO.MobileDTO;

public class MobileServiceImpl implements MobileService {
	int size =0;
	@Override
	public boolean validateSize(int size) {
		// TODO Auto-generated method stub
		System.out.println("inside validateSize  inside ServiceImpl");
		if(size >0) {
			System.out.println("size is greater than 0 inisde ServiceImpl");
			this.size=size;
			System.out.println("inside validate");
			return true;
		}
		else {
			System.out.println("size inisde validate size is less than 0 in ServiceImpl");
			return false;
		}
	}
	MobileDAO mobileDAO=new MobileDAOImpl(size);
	@Override
	public void validateAdd(MobileDTO mobileDTO) {
		// TODO Auto-generated method stub
		System.out.println("inside validate add inisde service impl");
		if(mobileDTO.getMobileId()>0) {
			System.out.println("mobile id is greater than 0");
			if(mobileDTO.getBrandName()!=null) {
				System.out.println("brand name is not null");
				if (mobileDTO.getModelName()!=null) {
					System.out.println("model name is not null");
					if(mobileDTO.getSerialNumber()>0) {
						System.out.println("serial number is not null");
						if(mobileDTO.getNoOfCamera()>0) {
							System.out.println("no of camera is greater than 0");
							if(mobileDTO.getPrice()>0) {
								System.out.println("price is greater than 0");
								if(mobileDTO.getMemory()!=null) {
									System.out.println("memory is not null");
									System.out.println("inside add validation inside ServiceImpl");
									System.out.println(mobileDAO.add(mobileDTO));
								}else {
									System.out.println("Wrong memory data");
								}
							}else {
								System.out.println("Wrong price data");
							}
						}else {
							System.out.println("Wrong no of camera data");
						}
					}else {
						System.out.println("Wrong serial number data");
					}
				}else {
					System.out.println("Wrong model name data");
				}
				
			}else {
				System.out.println("Wrong brandname dta ");
			}
		}else {
			System.out.println("Wrong mobile id data");
		}
	}

	@Override
	public void validateDeleteById(int mobileId) {
		// TODO Auto-generated method stub
		System.out.println("inside validate by delete by id inside ServiceImpl");
		if(mobileId>0) {
			System.out.println("validated id for delete function passed to dao");
			mobileDAO.deleteByMobileId(mobileId);
		}
		else {
			System.out.println("Wrong id given for delete by id  function  in ServiceImpl");
		}
	}

	@Override
	public void validateUpdateBySerialNo(int serialno,int price) {
		// TODO Auto-generated method stub
		System.out.println("inside validate and update price by serial no");
		if(serialno>0) {
			System.out.println("validated serialno by update function inside ServiceImpl");
			if(price>0) {
				System.out.println("validated price  by update function inside ServiceImpl");
				System.out.println(mobileDAO.updateBySerialNumber(serialno, price));
			}else {
				System.out.println("wrong price give to update function inside ServiceImpl");
			}
		}else {
			System.out.println("wrong serialNo given to update function inside ServiceImpl");
		}
	}

	

}
