package com.cg.ets.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ets.beans.Equipment;
import com.cg.ets.beans.User;

@Repository
public interface IEquipmentRepo extends JpaRepository<Equipment, String> {

	@Query(value = "select e.user from Equipment e Join e.user u where u.userId=(:userId) and u.password=(:password)")
	public User login(@Param(value = "userId") String userId, @Param(value = "password") String password);

	@Query(value = "select e From Equipment e where e.equipmentTag=(:equipmentTag)")
	public Equipment findByEquiTag(@Param(value = "equipmentTag") String equipmentTag);

	@Query(value = "select e From Equipment e where e.seqNum=(:seqNum)")
	public Equipment findBySeqNum(@Param(value = "seqNum") int seqNum);

	@Query(value = "select e from Equipment e Join e.user u where u.userId=(:userId)")
	public Equipment findByUserId(@Param(value = "userId") String userId);

	@Query(value = "select e from Equipment e Join e.compName m where m.compName=(:machineId)")
	public Equipment findByMachineId(@Param(value = "machineId") String machineId);

	@Query(value = "select e.compName.compName , e.user.userId, e.location.locationName from Equipment e where e.compName.compName=(:machineId)")
	public List<Equipment> printlabel(@Param(value = "machineId") String machineId);

	@Query(value = "select e from Equipment e where e.location.locationName=(:locationName)")
	//@Query(value="select e from Equipment e join e.location l where l.locationName=(:location) ")
	public Equipment findByLocation(@Param(value = "locationName") String locationName);
}
