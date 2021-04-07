package com.wolken.wolkenapp.DAO;

import com.wolken.wolkenapp.DTO.MobileDTO;

public class MobileDAOImpl implements MobileDAO {
	MobileDTO[] dto;
	int index = 0;
	int flag = 0;

	public MobileDAOImpl(int size) {
		System.out.println("inside parametrized constructor of MobileDAOImpl");
		dto = new MobileDTO[size];
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		System.out.println("inside getall method inside MobileDAOImpl ");
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dto[i]);
		}

	}

	@Override
	public void  deleteByMobileId(int mobileId) {
		// TODO Auto-generated method stub
		System.out.println("inside method delete by mobile id");
		for (int i = 0; i < dto.length; i++) {
			int id = dto[i].getMobileId();
			if (id == mobileId) {
				System.out.println("id and mobile id is equal condition is true ");
				System.out.println(dto[i]);
				dto[i] = null;
				System.out.println("data deleted using id ");
			}

		}
		System.out.println("printing data after deletion");
		for(int i=0;i<dto.length;i++) {
			System.out.println(dto[i]);
		}
	}

	@Override
	public MobileDTO updateBySerialNumber(int serialNumber, int price) {
		// TODO Auto-generated method stub
		System.out.println("inside update price by serial number inside MobileDAOImpl");
		for (int i = 0; i < dto.length; i++) {
			int Sno = dto[i].getSerialNumber();
			if (Sno == serialNumber) {
				System.out.println("serial number is found ");
				System.out.println("enter the price to be update");
				dto[i].setPrice(price);
				return dto[i];

			} else {
				System.out.println("serial number is not found");
				return null;
			}

		}
		return null;

	}

	@Override
	public void getAllByBrandName() {
		// TODO Auto-generated method stub
		System.out.println("get all by brand name inside MobileDAOImpl");
		for (int i = 0; i < dto.length; i++) {
			System.out.println(dto[i].getBrandName());
		}

	}

	public boolean add(MobileDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("inside add method inside MobileDAOImpl");
		System.out.println(index);
		System.out.println(dto);
		if (dto!=null){
			this.dto[index++]=dto;
			System.out.println("data is added inside MobileDAOImpl");
			return true;
			}
		else {
			System.out.println("data is not added MobileDAOImpl ");
			return false;
	}
	}

}
