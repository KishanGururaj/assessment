package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.LibraryDTO;

public interface LibraryService {
	public boolean validateAndSave(LibraryDTO libraryDTO);
	public boolean  validateAndUpdate(String name,String author);
	public boolean validateAndDelete(String name);
	public List<LibraryDTO> getAll();

}
