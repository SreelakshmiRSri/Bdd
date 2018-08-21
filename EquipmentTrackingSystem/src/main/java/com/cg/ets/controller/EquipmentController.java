package com.cg.ets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ets.beans.Equipment;
import com.cg.ets.exception.EquipmentException;
import com.cg.ets.service.IEquipmentService;

@RestController
public class EquipmentController {
	@Autowired
	IEquipmentService service;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String userId, String password) throws EquipmentException {
		try {

			return service.login(userId, password);

		} catch (EquipmentException e) {
			throw e;
		}
	}

	@RequestMapping(value = "/findByTag", method = RequestMethod.GET)
	public Equipment findByEquiTag(String equipmentTag) throws EquipmentException {
		try {
			return service.findByEquiTag(equipmentTag);

		} catch (EquipmentException e) {
			throw e;
		}
	}

	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	public Optional<Equipment> findByEquiId(String equipmentId) throws EquipmentException {
		try {
			return service.findByEquiId(equipmentId);

		} catch (EquipmentException e) {
			throw e;
		}
	}

	@RequestMapping(value = "/findBySeqNum", method = RequestMethod.GET)
	public Equipment findByEquiSeqNum(int seqNum) throws EquipmentException {
		try {
			return service.findByEquiSeqNum(seqNum);

		} catch (EquipmentException e) {
			throw e;
		}
	}

	@RequestMapping(value = "/findByUserId", method = RequestMethod.GET)
	public Equipment findByUserId(String userId) throws EquipmentException {
		try {
			return service.findByUserId(userId);

		} catch (EquipmentException e) {
			throw e;
		}
	}

	@RequestMapping(value = "/findByMachineId", method = RequestMethod.GET)
	public Equipment findByMachineId(String machineId) throws EquipmentException {
		try {
			return service.findByMachineId(machineId);

		} catch (EquipmentException e) {
			throw e;
		}
	}

	@RequestMapping(value = "/printLabel", method = RequestMethod.GET)
	public List<Equipment> printlabel(String machineId) throws EquipmentException {
		return service.printlabel(machineId);
	}

	@RequestMapping(value = "/findByLocation", method = RequestMethod.GET)
	public Equipment findByLocation(String locationName)throws EquipmentException {
		try {
			return service.findByLocation(locationName);
		} catch (EquipmentException e) {
			throw e;
		}
	}
}
