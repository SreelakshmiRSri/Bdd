package com.cg.ets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ets.beans.Equipment;
import com.cg.ets.exception.EquipmentException;
import com.cg.ets.repo.IEquipmentRepo;

@Service
public class EquipmentServiceImpl implements IEquipmentService {
	@Autowired
	IEquipmentRepo repo;

	@Override
	public String login(String userId, String password) throws EquipmentException {
		if (repo.login(userId, password) != null) {
			throw new EquipmentException("login sucessful");
		}
		throw new EquipmentException("Invalid userId or password");
	}

	@Override
	public Equipment findByEquiTag(String equipmentTag) throws EquipmentException {
		Equipment e = repo.findByEquiTag(equipmentTag);
		if (e != null) {
			return e;
		} else {
			throw new EquipmentException("Details not found");
		}
	}

	@Override
	public Optional<Equipment> findByEquiId(String equipmentId) throws EquipmentException {
		Optional<Equipment> e = repo.findById(equipmentId);
		if (e != null) {
			return e;
		} else {
			throw new EquipmentException("Details not found");
		}
	}

	@Override
	public Equipment findByEquiSeqNum(int seqNum) throws EquipmentException {
		Equipment e = repo.findBySeqNum(seqNum);
		if (e != null) {
			return e;
		} else {
			throw new EquipmentException("Details not found");
		}
	}

	@Override
	public Equipment findByUserId(String userId) throws EquipmentException {
		Equipment e = repo.findByUserId(userId);
		if (e != null) {
			return e;
		} else {
			throw new EquipmentException("Details not found");
		}
	}

	@Override
	public Equipment findByMachineId(String machineId) throws EquipmentException {
		Equipment e = repo.findByMachineId(machineId);
		if (e != null) {
			return e;
		} else {
			throw new EquipmentException("Details not found");
		}
	}

	@Override
	public List<Equipment> printlabel(String machineId) throws EquipmentException {
		List<Equipment> e=repo.printlabel( machineId);
		if(e!=null) {
			return e;
		}else {
			throw new EquipmentException("enter valid machine Id");
		}
		
		
	}

	@Override
	public Equipment findByLocation(String locationName) {
		System.out.println("///////////////////////"+locationName);
		Equipment e=repo.findByLocation(locationName);
		System.out.println("*************"+e);
		return e;
	}
}
