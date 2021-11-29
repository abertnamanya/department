package org.openmrs.module.department.api.dao;

import org.openmrs.module.department.Department;

import java.util.List;

public interface DepartmentDAO {
	
	List<Department> getAllDepartments();
	
	Department getDepartment(Integer departmentId);
	
	Department saveDepartment(Department department);
	
	void purgeDepartment(Department department);
}
