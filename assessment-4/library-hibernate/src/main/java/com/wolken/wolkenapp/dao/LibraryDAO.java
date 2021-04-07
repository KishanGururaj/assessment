package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.LibraryException;
import com.wolken.wolkenapp.dto.LibraryDTO;

public interface LibraryDAO {
	public boolean save(LibraryDTO libraryDTO);
	public boolean  updateByName(String name,String author);
	public boolean  deleteByName(String name) throws LibraryException;
	public List<LibraryDTO> getAll();


}
