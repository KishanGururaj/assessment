package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.DTO.MobileDTO;

public interface MobileService {
	public boolean validateSize(int size);
	public void validateAdd(MobileDTO mobileDTO);
	public void validateDeleteById(int mobileId);
	public void validateUpdateBySerialNo(int serialno,int price);

}
