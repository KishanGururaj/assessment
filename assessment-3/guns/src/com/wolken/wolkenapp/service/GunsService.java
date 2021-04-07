package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.GunsDTO;

public interface GunsService {
	public void validateAdd(GunsDTO gunsDTO);
	public void validateGetAll();
	public void validateDeleteByGunsId(int gunsId);
	public void  validateUpdateBySerialNumber(int serialNumber);
	public void validateGetAllBrandName(String brandName);
	public void validateGetAllByCountryName();

}
