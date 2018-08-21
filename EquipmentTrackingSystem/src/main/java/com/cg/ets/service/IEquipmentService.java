package com.cg.ets.service;

import java.util.List;
import java.util.Optional;

import com.cg.ets.beans.Equipment;
import com.cg.ets.exception.EquipmentException;

public interface IEquipmentService {
	public String login(String userId, String password) throws EquipmentException;

	public Equipment findByEquiTag(String equipmentTag) throws EquipmentException;

	public Optional<Equipment> findByEquiId(String equipmentId) throws EquipmentException;

	public Equipment findByEquiSeqNum(int equipmentId)throws EquipmentException;

	public Equipment findByUserId(String userId)throws EquipmentException;

	public Equipment findByMachineId(String machineId)throws EquipmentException;

	public List<Equipment> printlabel(String machineId)throws EquipmentException;
	
	public Equipment findByLocation(String locationName)throws EquipmentException;
}
