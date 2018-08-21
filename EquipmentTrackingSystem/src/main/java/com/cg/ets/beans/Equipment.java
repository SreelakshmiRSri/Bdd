package com.cg.ets.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Equipment {
	
	@Column(name="equipment_tag")
	private String equipmentTag;
	@Id
	@Column(name="equipment_code")
	private String equipmentCode;
	
	@Column(name="equipment_type")
	private String equipmentType;
	
	@Column(name="status")
	private String status;
	
	@OneToOne
	//(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="machine")
	private ComTrack compName;
	
	@Column(name="seq_num")
	private int seqNum;
	
	@JoinColumn(name="location_id")
	@OneToOne
	//(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Location location;
	
	@JoinColumn(name="user_id")
	@OneToOne
	//(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private User user;
	
	@Column(name="cost_center")
	private String costCenter;
	
	@Column(name="install_date")
	private Date installDate;
	
	@Override
	public String toString() {
		return "Equipment [equipmentTag=" + equipmentTag + ", equipmentCode=" + equipmentCode + ", equipmentType="
				+ equipmentType + ", status=" + status + ", compName=" + compName + ", seqNum=" + seqNum + ", location="
				+ location + ", user=" + user + ", costCenter=" + costCenter + ", installDate=" + installDate + "]";
	}

	public String getEquipmentTag() {
		return equipmentTag;
	}

	public void setEquipmentTag(String equipmentTag) {
		this.equipmentTag = equipmentTag;
	}

	public String getEquipmentCode() {
		return equipmentCode;
	}

	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ComTrack getCompName() {
		return compName;
	}

	public void setCompName(ComTrack compName) {
		this.compName = compName;
	}

	public int getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public Date getInstallDate() {
		return installDate;
	}

	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}

	
}
