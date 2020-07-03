package demo.springboot.thymeleaf.dao;

import demo.springboot.thymeleaf.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
