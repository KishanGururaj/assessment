package com.wolken.wolkenapp.DAO;

import com.wolken.wolkenapp.DTO.MobileDTO;

public interface MobileDAO {
	
	public boolean add(MobileDTO dto);
	public void getAll ();
	public void  deleteByMobileId( int mobileId);
	public MobileDTO updateBySerialNumber (int serialNumber,int price);
	public void getAllByBrandName();

}
