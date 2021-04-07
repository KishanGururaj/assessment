package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.dao.GunsDAO;
import com.wolken.wolkenapp.dao.GunsDAOImpl;
import com.wolken.wolkenapp.dto.GunsDTO;

public class GunsServiceImpl implements GunsService {
	GunsDAO gunsDAO=new GunsDAOImpl();
	@Override
	public void validateAdd(GunsDTO gunsDTO) {
		// TODO Auto-generated method stub
		System.out.println("inside validate and add inisde service impl");
		if (gunsDTO.getGunsId()>0) {
			System.out.println("guns id is greater than 0 ");
			if(gunsDTO.getBrandName()!=null) {
				System.out.println("brand name is not null");
				if(gunsDTO.getMadeIn()!=null) {
					System.out.println("Made In is not null");
					if(gunsDTO.getName()!=null) {
						System.out.println("name is null");
						if(gunsDTO.getNoOfBullets()>0) {
							System.out.println("no of bullets greater than 0");
							if(gunsDTO.getPrice()>0) {
								System.out.println("price is greater than 0");
								if(gunsDTO.getSerialNumber()>0) {
									System.out.println("serial number is greater than is 0");
									if(gunsDTO.getType()!=null) {
										System.out.println("type is not null");
										try {
											System.out.println("passed to dao from service inside add");
											gunsDAO.add(gunsDTO);
										} catch (SQLException e) {
											// TODO Auto-generated catch block
											System.out.println("inside catch block inside ServiceImpl ");
											e.printStackTrace();
										}
									}else {
										System.out.println("wrong type inside ServiceImpl");
									}
								}else {
									System.out.println("wrong serial number inside ServiceImpl");
								}
							}else {
								System.out.println("wrong price inside ServiceImpl");
							}
						}else {
							System.out.println("wrong no of bullets inside ServiceImpl");
						}
					}else {
						System.out.println("wrong name inside ServiceImpl");
					}
				}else {
					System.out.println("wrong made in inside ServiceImpl");
				}
			}else {
				System.out.println("wrong brand name inside ServiceImpl ");
			}
		}else {
			System.out.println("wrong id inside ServiceImpl");
		}
	}

	@Override
	public void validateGetAll() {
		// TODO Auto-generated method stub
		System.out.println("inside validate get all inside inside ServiceImpl");
		try {
			System.out.println("inside get all method ");
			gunsDAO.getAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("inside catch block for exception");
			e.printStackTrace();
		}
	}

	@Override
	public void validateDeleteByGunsId(int gunsId) {
		// TODO Auto-generated method stub
		System.out.println("inside validate and delete by guns id inside ServiceImpl");
		if(gunsId>0) {
			try {
				System.out.println("inside guns id is greater than 0");
				gunsDAO.deleteByGunsId(gunsId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("inside catch block inside validate by guns id inside ServiceImpl");
				e.printStackTrace();
			}
			
		}else {
			System.out.println("wrong id  validate and delete inside ServiceImpl ");
		}
	}

	@Override
	public void validateUpdateBySerialNumber(int serialNumber) {
		// TODO Auto-generated method stub
		System.out.println("inside validate and update by serial number");
		if(serialNumber>0) {
			try {
				System.out.println("serial number is greater than 0");
				gunsDAO.updateBySerialNumber(serialNumber);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("inside catch block validate and update by serial number inside ServiceImpl");
				e.printStackTrace();
			}
		}else {
			System.out.println("wrong serial Number update by serial number inside ServiceImpl");
		}
	}

	@Override
	public void validateGetAllBrandName(String brandName) {
		// TODO Auto-generated method stub
		System.out.println("inside getall by brand name inside ServiceImpl");
		if(brandName!=null) {
			try {
				System.out.println("brand name is not null inside getall by brand name inside ServiceImpl");
				gunsDAO.getAllBrandName(brandName);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("inside catch block validate get all by brand name inside ServiceImpl");
				e.printStackTrace();
			}
		}else {
			System.out.println("wrong brand name validate get all by brand name inside ServiceImpl");
		}
	}

	@Override
	public void validateGetAllByCountryName() {
		// TODO Auto-generated method stub
		try {
			System.out.println("validate get all by country name inside ServiceImpl");
			gunsDAO.getAllByCountryName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("inside catch block validate get all by country name inside ServiceImpl");
			e.printStackTrace();
		}
	}

}
