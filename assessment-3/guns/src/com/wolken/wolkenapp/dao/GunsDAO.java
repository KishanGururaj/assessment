package com.wolken.wolkenapp.dao;

import java.sql.SQLException;

import com.wolken.wolkenapp.dto.GunsDTO;

public interface GunsDAO {
	public void add(GunsDTO gunsDTO) throws SQLException;
	public void getAll() throws SQLException;
	public GunsDTO deleteByGunsId(int gunsId) throws SQLException;
	public GunsDTO updateBySerialNumber(int serialNumber) throws SQLException;
	public void getAllBrandName(String brandName) throws SQLException;
	public void getAllByCountryName() throws SQLException;

}
