package com.cg.ets.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ComTrack {
	@Id
	@Column(name = "computer_name")
	private String compName;
	
	@Column(name = "disk_capacity")
	private String diskCapacity;
	
	@Column(name = "total_installed_memory")
	private String totalInstalledMemory;
	
	@Column(name = "network_cardNumber")
	private String networkCardNumber;
	
	@Column(name="network_card_manufacturer")
	private String	networkCardManufacturer;
	
	@Column(name="free_space_on_C_Drive")
	private String	freeSpacenCDrive;
	
	@Column(name="operating_system")
	private String	operatingSystem;
	
	@Column(name="os_version")
	private String	osVersion;

	@Override
	public String toString() {
		return "ComTrack [compName=" + compName + ", diskCapacity=" + diskCapacity + ", totalInstalledMemory="
				+ totalInstalledMemory + ", networkCardNumber=" + networkCardNumber + ", networkCardManufacturer="
				+ networkCardManufacturer + ", freeSpacenCDrive=" + freeSpacenCDrive + ", operatingSystem="
				+ operatingSystem + ", osVersion=" + osVersion + "]";
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getDiskCapacity() {
		return diskCapacity;
	}

	public void setDiskCapacity(String diskCapacity) {
		this.diskCapacity = diskCapacity;
	}

	public String getTotalInstalledMemory() {
		return totalInstalledMemory;
	}

	public void setTotalInstalledMemory(String totalInstalledMemory) {
		this.totalInstalledMemory = totalInstalledMemory;
	}

	public String getNetworkCardNumber() {
		return networkCardNumber;
	}

	public void setNetworkCardNumber(String networkCardNumber) {
		this.networkCardNumber = networkCardNumber;
	}

	public String getNetworkCardManufacturer() {
		return networkCardManufacturer;
	}

	public void setNetworkCardManufacturer(String networkCardManufacturer) {
		this.networkCardManufacturer = networkCardManufacturer;
	}

	public String getFreeSpacenCDrive() {
		return freeSpacenCDrive;
	}

	public void setFreeSpacenCDrive(String freeSpacenCDrive) {
		this.freeSpacenCDrive = freeSpacenCDrive;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

}
