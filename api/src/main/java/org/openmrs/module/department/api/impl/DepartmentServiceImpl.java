/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 * <p>
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.department.api.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.department.Department;
import org.openmrs.module.department.api.DepartmentService;
import org.openmrs.module.department.api.dao.DepartmentDAO;
import org.openmrs.module.department.api.dao.DepartmentDao;

import java.util.List;

public class DepartmentServiceImpl extends BaseOpenmrsService implements DepartmentService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private DepartmentDAO departmentDAO;
	
	public DepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}
	
	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}
	
	@Override
	public List<Department> getAllDepartments() {
		return departmentDAO.getAllDepartments();
	}
	
	@Override
	public Department getDepartment(Integer departmentId) {
		return departmentDAO.getDepartment(departmentId);
	}
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentDAO.saveDepartment(department);
	}
	
	@Override
	public void purgeDepartment(Department department) {
		departmentDAO.purgeDepartment(department);
	}
	
}
