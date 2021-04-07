package com.wolken.wolkenapp;

import java.util.Scanner;

import com.wolken.wolkenapp.dto.GunsDTO;
import com.wolken.wolkenapp.service.GunsService;
import com.wolken.wolkenapp.service.GunsServiceImpl;

public class GunsUtil {
	
	public static void main(String[] args) {
		System.out.println("inside main method ");
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the size");
		int size =scanner.nextInt();
		GunsService gunsService =new GunsServiceImpl();
		for (int i=0;i<size;i++) {
			GunsDTO gunsDTO=new GunsDTO();
			System.out.println("enter the gun details");
			System.out.println("enter the gun id");
			gunsDTO.setGunsId(scanner.nextInt());
			System.out.println("enter the gun name ");
			gunsDTO.setName(scanner.next());
			System.out.println("enter the price");
			gunsDTO.setPrice(scanner.nextInt());
			System.out.println("enter the serial no");
			gunsDTO.setSerialNumber(scanner.nextInt());
			System.out.println("enter brand name ");
			gunsDTO.setBrandName(scanner.next());
			System.out.println("enter the type");
			gunsDTO.setType(scanner.next());
			System.out.println("enter no of bullets ");
			gunsDTO.setNoOfBullets(scanner.nextInt());
			System.out.println("enter the made in");
			gunsDTO.setMadeIn(scanner.next());
			System.out.println("inside validate and add gunsDTO");
			gunsService.validateAdd(gunsDTO);
		}
		System.out.println("inside validate qand getalll method s");
		gunsService.validateGetAll();
		System.out.println("enter the id for which data has to be deleted ");
		gunsService.validateDeleteByGunsId(scanner.nextInt());
		System.out.println("enter the serial number whose data has to updated ");
		System.out.println("inside validate and update  serial number by id  ");
		gunsService.validateUpdateBySerialNumber(scanner.nextInt());
		System.out.println("enter the brand name ");
		System.out.println("inside get all by brand name");
		gunsService.validateGetAllBrandName(scanner.next());
		System.out.println("valdate and getall by country name");
		gunsService.validateGetAllByCountryName();
	}

}
