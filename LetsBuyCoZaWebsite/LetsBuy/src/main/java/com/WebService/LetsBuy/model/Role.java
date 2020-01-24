package com.WebService.LetsBuy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long roleID;
	private String rolename;

	public Role() {
	}

	public Role(String rolename) {
		this.rolename = rolename;
	}

	public Long getRoleID() {
		return roleID;
	}

	public void setRoleID(Long roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return rolename;
	}

	public void setRoleName(String rolename) {
		this.rolename = rolename;
	}

	@Override
	public String toString() {
		return "Role{" + "roleID=" + roleID + ", name='" + rolename + '\'' + '}';
	}
}